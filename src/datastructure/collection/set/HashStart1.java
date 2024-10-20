package datastructure.collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        //입력 : 0~9 사이의 여러 값이 입력된다. 중복된 값은 입력되지 않는다.
        //출력 : 0~9 사이의 값이 하나 입력된다. 입력된 값 중에 찾는 값이 있는지 확인해보자.

        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;

        //배열에서 특정 데이터를 찾는 성능은 O(n)으로 느리다.당연히 데이터가 많아질 수록 더 느려진다. 문제의 핵심은 찾기 성능이 O(n)으로 느리다는 점이다.
        for (int inputValue : inputArray) {
            if (8 == inputValue) {
                System.out.println(inputValue);
            }
        }
    }
}
