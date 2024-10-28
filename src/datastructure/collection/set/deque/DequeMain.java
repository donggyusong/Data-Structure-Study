package datastructure.collection.set.deque;

import java.util.ArrayDeque;

public class DequeMain {
    public static void main(String[] args) {
        ArrayDeque<Object> deque = new ArrayDeque<>();

        //데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerFirst(3);
        System.out.println(deque);
        deque.offerFirst(4);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        //데이터 꺼내기
        System.out.println("pollFirst = " + deque.pollFirst()); // 4
        System.out.println("pollFirst = " + deque.pollFirst()); // 3
        System.out.println("pollLast = " + deque.pollLast()); // 1
        System.out.println("pollLast = " + deque.pollLast()); // 2

    }
}
