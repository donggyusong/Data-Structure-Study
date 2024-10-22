package datastructure.collection.set;

import java.util.LinkedList;

public class MyHashSetV1 {

    /**
     * 해시 인덱스를 사용한 SET 구현
     * add() : 셋에 값을 추가한다. 중복된 데이터는 저장하지 않는다.
     * contains() : 중복된 값이 있는지 확인한다.
     * remove() : 셋에 있는 값을 삭제한다.
     */

    private static final int CAPACITY = 10;
    LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

    public void add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }



    private int hashIndex(int value) {
        return value % CAPACITY;
    }
}
