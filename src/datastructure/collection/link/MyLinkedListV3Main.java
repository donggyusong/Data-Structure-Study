package datastructure.collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        String string = list.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("intList = " + intList);
        Integer integer = intList.get(2);
        System.out.println("integer = " + integer);
    }
}
