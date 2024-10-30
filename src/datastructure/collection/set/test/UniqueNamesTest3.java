package datastructure.collection.set.test;

import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(1,2,3));

        for (Integer s : treeSet) {
            System.out.println(s);
        }
    }
}
