package datastructure.collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        /**
         * 공간도 절약하면서,넓은 범위의 값을 사용할 수 있는 방법이 바로 "나머지 연산"을 사용하는거다.
         * 저장할 수 있는 배열의 크기(CAPACITY)에 맞춰서 나머지 연산을 하면 된다.
         * 이 나머지 연산 결과를 배열의 인덱스로 사용하면 되고 나머지 연산의 결과는 절대로 배열의 크기를 넘을 수 없다.
         * => 배열의 인덱스를 사용하기 때문에 하나의 값을 저장하는데 O(1)로 빠른 성능을 제공한다.
         *    해시 인덱스 생성 O(1) + 해시 인덱스를 사용해 배열에 값 저장 O(1) -> O(1)
         *
         * 해시 인덱스
         * - 배열의 인덱스로 사용할 수 있도록 원래의 값을 계산한 인덱스를 해시 인덱스(hashIndex)라 한다.
         */

        //{1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];

        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println(Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(14);
        System.out.println("hashIndex = " + hashIndex); //5
        Integer result = inputArray[hashIndex];
        System.out.println("result = " + result);
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    //해시 인덱스를 반환한다.
    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
