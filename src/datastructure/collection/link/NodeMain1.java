package datastructure.collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성 A->B->C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        Node x = first;

        System.out.println("모든 노드 탐색하기");
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }

    }
}
