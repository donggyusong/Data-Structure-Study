package datastructure.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    /**
     * O(n) -> 중복된 데이터가 있는지 전체 데이터를 항상 확인해야 한다.
     * 중복 데이터 검색O(n) + 데이터 입력O(1) -> O(n+1) 상수무시 -> O(n)
     */
    public boolean add(int value) {
        if (contains(value)) { //O(n)
            return false;
        }
        elementData[size] = value; //O(1)
        size++;
        return true;
    }


    //O(n) -> 배열에 있는 모든 데이터를 찾고 비교해야 하므로 평균 O(n)이 걸린다 -> 성능에 발목을 잡음 -> 해쉬 알고리즘 사용하자
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }

        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
