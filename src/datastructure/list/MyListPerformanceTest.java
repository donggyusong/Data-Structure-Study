package datastructure.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList 추가 ==");
        addFirst(new ArrayList<>(),size); //O(n)
        addMid(new ArrayList<>(), size);  //찾는데 O(1) + 데이터 추가(밀기) O(n) -> O(n) : MyLinkedList보다 MyArrayList가 더 빠르다. 왜?
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList,size); //찾는데 O(1) + 데이터 추가 O(1) -> O(1)

        System.out.println("== MyLinkedList 추가 == ");
        addFirst(new LinkedList<>(), size); //O(1)
        addMid(new LinkedList<>(), size); //찾는데 O(n) + 데이터 추가 O(1) -> O(n)
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList,size); //찾는데 O(n) + 데이터 추가 O(1) -> O(n)

        int loop = 10000;
        System.out.println("== MyArrayList 조회 ==");
        getIndex(arrayList,loop,0);
        getIndex(arrayList,loop,size / 2);
        getIndex(arrayList,loop,size - 1);

        System.out.println("== MyLinkedList 조회 ==");
        getIndex(linkedList,loop,0);
        getIndex(linkedList,loop,size / 2);
        getIndex(linkedList,loop,size - 1);

        System.out.println("== MyArrayList 검색 ==");
        search(arrayList,loop,0);
        search(arrayList,loop,size / 2 );
        search(arrayList,loop,size - 1);

        System.out.println("== MyLinkedList 검색 ==");
        search(linkedList,loop,0);
        search(linkedList,loop,size / 2 );
        search(linkedList,loop,size - 1);

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.nanoTime();
        for (int i = 0; i < loop ; i++) {
            //list.get(index);
        }
        long endTime = System.nanoTime();
        System.out.println("index : " + index + ", 반복 : " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int searchValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(searchValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue : " + searchValue + ", 반복 :" + loop + ", 계산시간 " + (endTime - startTime) + "ms");
    }
}