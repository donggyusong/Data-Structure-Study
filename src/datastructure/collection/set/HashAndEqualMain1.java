package datastructure.collection.set;

public class HashAndEqualMain1 {
    public static void main(String[] args) {

        /**
         * <Object의 기본기능>
         * hashCode() : 객체의 참조값을 기반으로 해시 코드를 반환한다.
         * equals() : == 동일성 비교를 한다. 따라서 객체의 참조값이 같아야 true를 반환한다.
         */

        MyHashSetV2 set = new MyHashSetV2();
        //객체의 참조값 기반으로 해시 코드를 생성하기 때문에 매번 결과가 다르다.
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}