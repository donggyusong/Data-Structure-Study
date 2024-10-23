package datastructure.collection.set;

import datastructure.collection.set.member.Member;

public class HashAndEqualMain3 {
    public static void main(String[] args) {

        /**
         * <Object의 기본기능>
         * hashCode() : 객체의 참조값을 기반으로 해시 코드를 반환한다.
         * equals() : == 동일성 비교를 한다. 따라서 객체의 참조값이 같아야 true를 반환한다.
         */


        MyHashSetV2 set = new MyHashSetV2();
        //id로 hashCode()를 재정의함.
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //같다.
        System.out.println("m2.hashCode() = " + m2.hashCode()); //같다.
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        //검색 실패
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
