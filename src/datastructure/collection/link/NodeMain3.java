package datastructure.collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 : A->B->C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println(lastNode);

        //특정 index의 노드 구하기 -> 여기서 말하는 index는 순서 같은 개념
        int index = 2;
        Node indexNode = getNode(first, index);
        System.out.println("indexNode = " + indexNode.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void add(Node first, String item) {
        //마지막 노드 구하기 -> O(n)
        Node lastNode = getLastNode(first);

        lastNode.next = new Node(item);
    }

    private static Node getNode(Node first, int index) {
        Node x = first;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    private static Node getLastNode(Node first) {
        Node x = first;

        //O(n)
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    private static void printAll(Node first) {
        Node x = first;

        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
