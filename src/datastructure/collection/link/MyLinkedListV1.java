package datastructure.collection.link;

public class MyLinkedListV1 {

    //첫 노드의 위치를 가르킨다.
    private Node first;

    //자료구조에 입력된 데이터의 사이즈, 데이터가 추가될 때 마다 하나씩 증가한다.
    private int size=0;

    /**
     * 마지막에 데이터를 추가한다.
     * 새로운 노드를 만들고,마지막 노드를 찾아서 새로운 노드를 마지막에 연결한다.
     * 만약 노드가 하나도 없다면 새로운 노드를 만들고 first에 연결한다.
     *
     * 시간복잡도 O(n)
     * => 마지막 노드를 찾는데 O(n)이 걸린다.마지막 노드에 새로운 노드르 추가하는데 O(1)이 걸린다.
     *    O(n+1) -> 상수 무시 후 O(n)
     */
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            //노드가 하나도 없는 경우
            first = newNode;
        } else{
            //노드가 하나라도 있는 경우

            //마지막 노드를 가져온다.
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    /**
     * 특정 위치에 있는 데이터를 찾아서 변경한다. 그리고 기존값을 반환한다.
     * getNode(index)를 통해 특정 위치에 있는 노드를 찾고,단순히 그 노드에 있는 item 데이터를 변경한다.
     *
     * 시간복잡도 O(n)
     */
    public Object set(int index, Object element) {
        Node indexNode = getNode(index);
        Object oldValue = indexNode.item;
        indexNode.item = element;

        return oldValue;
    }

    /**
     * 특정 위치에 있는 데이터를 반환한다.
     * getNode(index)를 통해 측정 위치에 있는 노드를 찾고,해당 노드에 있는 값을 반환한다.
     */
    public Object get(int index) {
        Node indexNode = getNode(index);
        return indexNode.item;
    }

    /**
     * 데이터를 검색하고,검색된 위치를 반환한다.
     * 모든 노드를 순회하면서 equals()를 사용해서 같은 데이터가 있는지 찾는다.
     *
     * 시간복잡도 O(n)
     */
    public int indexOf(Object o) {
        Node x = first;
        int index = 0;

        while (true) {
            if (x.item.equals(o)) {
                break;
            }
            x = x.next;
            index++;
        }

        return index;
    }

    public int size() {
        return size;
    }

    /**
     * 특정 위치에 있는 노드를 찾는다.
     * 시간복잡도 O(n) - 특정 위치의 노드를 찾는데 O(n)이 걸린다.
     * => 배열은 인덱스로 원하는 데이터를 즉시 찾을 수 있다. 따라서 배열을 사용하는 배열 리스트(ArrayList)도 인덱스 조회 시 O(1)의 빠른 성능을 보장한다.
     *    하지만 연결 리스트에서 사용하는 노드들은 배열이 아니다.단지 다음 노드에 대한 참조만 있을 뿐이다.
     *    따라서 인덱스로 원하는 위치의 데이터를 찾으려면 인덱스 숫자 만큼 다음 노드를 반복해서 찾아야한다. 따라서 인덱스 조회 성능이 나쁘다.O(n)
     */
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //마지막 노드 찾기 -> O(n)
    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
