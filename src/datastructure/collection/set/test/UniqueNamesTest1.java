package datastructure.collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        //코드 작성
        Set<Integer> set = new HashSet<Integer>();
        for (Integer value : inputArr) {
            set.add(value);
        }

        for (Integer value : set) {
            System.out.println(value);
        }


    }
}
