package datastructure.arralist;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSample {
    public static void main(String[] args) {
        ListSample listSample = new ListSample();
        listSample.checkArrayList8();
    }

    private void checkArrayList1() {
        ArrayList<String> list = new ArrayList<>();
    }

    private void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        System.out.println(list);
        System.out.println(list.size());
    }

    private void checkArrayList3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
        for (String string : list2) {
            System.out.println("List2 = " + string);
        }
    }

    private void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        String[] array = list.toArray(new String[4]);
        System.out.println(Arrays.toString(array));
    }

    private void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[2];
        String[] strList = list.toArray(tempArray);
        for (String string : strList) {
            System.out.println("string = " + string);
        }
    }

    private void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        //System.out.println("Removed " + list.remove(0));
        //System.out.println("Removed " + list.remove("A"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("A");
        list.removeAll(temp);
        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println("list.get("+loop+")=" + list.get(loop));
        }

    }
}
