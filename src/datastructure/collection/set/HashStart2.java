package datastructure.collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {

        /**
         * 배열은 "인덱스"의 위치를 사용해서 데이터를 찾을 때 O(1)로 매우 빠른 특징을 가지고 있다.
         * 반면 배열에서 데이터를 검색할 때 배열에 들어있는 데이터 하나하나를 모두 비교해야 하므로 인덱스를 활용할 수 없다.
         * 만약 배열에서 데이터를 검색할 때 인덱스를 활용할 수 있다면 O(n) -> O(1)으로 성능을 바꿀 수 있다.
         * => 데이터 값 자체를 인덱스로 사용하자
         * => 문제 : 입력 값의 범위 만큼 큰 배열을 사용해야 한다.따라서 배열에 낭비되는 공간이 발생한다.
         */

        //입력 : 1 2 5 8
        //[null, 1, 2, null, null, 5, null, null, 8, null, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; //O(1)
        System.out.println("result = " + result);
    }
}
