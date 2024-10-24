package datastructure.arralist;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        //마지막에 추가 O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast"); //O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); //O(n)
        System.out.println(list);

        //삭제
        Object remove = list.remove(4); //O(1)
        System.out.println("remove = " + remove);
        System.out.println(list);

        Object remove1 = list.remove(0);
        System.out.println("remove1 = " + remove1);
        System.out.println(list);
    }
}
