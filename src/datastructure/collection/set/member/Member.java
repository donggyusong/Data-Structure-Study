package datastructure.collection.set.member;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        /**
         * - Member는 hashCode()를 재정의 했다.
         * - hashCode()를 재정의할 때 Objects.hash()에 해시 코드로 사용할 값을 지정해주면 쉽게 해시 코드를 생성할 수 있다.
         * - hashCode()를 재정의하지 않으면 Object가 기본으로 제공하는 hashCode()를 사용하게 되는데 이는 객체의 참조값 기준으로
         *   해시코드를 제공한다. 따라서 회원 id가 같아도 인스턴스가 다르면 다른 해시 코드를 반환하게 된다.
         * - hashCode()를 id를 기반으로 재정의한 덕분에 인스턴스가 달라도,id 값이 같으면 같은 해시 코드를 반환한다.
         */
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
