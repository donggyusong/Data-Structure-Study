package datastructure.collection.set;

public class HashAndEqualMain2 {
    public static void main(String[] args) {

        /**
         * <Object의 기본기능>
         * hashCode() : 객체의 참조값을 기반으로 해시 코드를 반환한다.
         * equals() : == 동일성 비교를 한다. 따라서 객체의 참조값이 같아야 true를 반환한다.
         */


        MyHashSetV2 set = new MyHashSetV2();
        //id로 hashCode()를 재정의함. equals()는 재정의 안함.
        MemberHashOnly m1 = new MemberHashOnly("A");
        MemberHashOnly m2 = new MemberHashOnly("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //같다.
        System.out.println("m2.hashCode() = " + m2.hashCode()); //같다.
        System.out.println("m1.hashCode() == m2.hashCode() : " + (m1.hashCode() == m2.hashCode()));
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set); //hashCode가 같기 때문에 같은 hashIndex는 가지나 객체의 참조값이 다르므르 둘 다 저장된다.

        //검색 실패
        MemberHashOnly searchValue = new MemberHashOnly("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
