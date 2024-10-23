package datastructure.collection.set;

import java.util.Objects;

public class MemberHashOnly {
    private String id;

    public MemberHashOnly(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MemberHashOnly{" +
                "id='" + id + '\'' +
                '}';
    }
}
