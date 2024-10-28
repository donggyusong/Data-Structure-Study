package datastructure.collection.set;

import datastructure.collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa1 = new Member("JPA");
        Member jpa2 = new Member("jpa");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode = " + hi.hashCode());
        System.out.println("jpa1.hashCode = " + jpa1.hashCode());
        System.out.println("jpa2.hashCode = " + jpa2.hashCode());
        System.out.println("java.hashCode = " + java.hashCode());
        System.out.println("spring.hashCode = " + spring.hashCode());

        set.add(hi);
        set.add(jpa1);
        set.add(jpa2);
        set.add(java);
        set.add(spring);
        System.out.println("set = " + set);

        //검색
        //Member searchValue = new Member("JPA");
        //boolean contains = set.contains(searchValue);
        //System.out.println("contains = " + contains);
    }
}
