package datastructure.collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        /**
         * 데이터의 값을 인덱스로 사용하는 방식은 입력 값의 범위가 넓다면 사용하기 어려워 보인다.
         * 데이터의 값을 인덱스로 사용하는 방법은 매우 빠른 성능을 보장하지만,입력 값의 범위가 조금만 커져도 메모리 낭비가 심하다.
         * => 나머지 연산을 사용하자
         */

        //{1,2,5,8,14,99}
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println(Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; //O(1)
        System.out.println("result = " + result);
    }
}
