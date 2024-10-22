package datastructure.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    /**
     * 해시 충돌이 발생하면 데이터를 추가하거나 조회할 때,연결 리스트 내부에 O(n)의 추가 연산을 해야 하므로 성능이 떨어진다.
     * 따라서 해시 충돌은 가급적 발생하지 않도록 해야한다.
     * => 해시 충돌이 발생할 확률은 입력하는 데이터의 수와 배열의 크기와 관련이 있다.
     *    입력하는 데이터의 수와 비교해서 배열의 크기가 클 수록 충돌 확률이 낮아진다.
     *    => 통계적으로 입력한 데이터의 수가 배열의 크기를 75% 넘지 않으면 해시 인덱스는 자주 충돌하지 않는다. 반대로 75%를 넘으면 자주 충돌하기 시작한다.
     *       배열의 크기를 크게 만들면 해시 충돌은 줄어서 성능은 좋아지지만, 많은 메모리가 낭비된다. 반대로 배열의 크기를 너무 작게 만들면 해시가 자주 충돌해서 성능이 나빠진다.
     *       상황에 따라 다르겠지만 75%를 적절한 크기로 보고 기준으로 잡는게 효과적이다.
     *
     * 해시 인덱스를 사용한 경우 시간 복잡도
     * - 데이터 저장
     *     - 평균 : O(1)
     *     - 최악 : O(n)
     * - 데이터 조회
     *     - 평균 : O(1)
     *     - 최악 : O(n)
     *
     */

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains = " + contains);

    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if (!bucket.contains(value)) { //O(n) -> 모든 항목을 다 순회하기 때문에 성능이 O(n)이다. 그러나 해시 충돌이 발생하지 않으면 데이터가 1개만 들어있어 O(1)의 성능을 제공한다.
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
