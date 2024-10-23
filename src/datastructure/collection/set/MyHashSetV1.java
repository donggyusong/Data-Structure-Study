package datastructure.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    /**
     * 해시 인덱스를 사용한 SET 구현
     * add() : 셋에 값을 추가한다. 중복된 데이터는 저장하지 않는다.
     * contains() : 중복된 값이 있는지 확인한다.
     * remove() : 셋에 있는 값을 삭제한다.
     */

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        //1.해시 인덱스를 구하자.
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        //2.중복 확인
        if (bucket.contains(value)) {
            return false;
        }

        //3.더하자.
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        //1.해시 인덱스를 구하자.
        int hashIndex = hashIndex(searchValue);

        //2.해당 인덱스의 LinkedList를 가져오자
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        //해시 인덱스를 구하자.
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        }else{
            return false;
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }
}
