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
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //false

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set); //hashcode가 다르므로 서로 다르다. hashIndex는 같을수도 있고 다를수도 있다. 그리고 두 객체는 중복이 아니기 때문에 저장이 된다.

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());

        /**
         * searchValue의 해시코드가 어떻게 나오느냐에따라 같은 hashIndex가 같을 수 있고 다를 수 있다.
         * - hashIndex가 같은 경우
         *   equals() 비교를 할 건데 Object가 기본으로 제공하는 기능을 사용하므로 참조값 비교를 한다. 그렇기 때문에 검색이 안된다.
         * - hashIndex가 다른 경우
         *   다른 위치에 있으므로 검색할 데이터가 없다.
         */
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
