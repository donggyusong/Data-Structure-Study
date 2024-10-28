package datastructure.collection.set.deque;

import java.util.ArrayDeque;

public class DequeQueueMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek()); //1

        //데이터 꺼낸기
        System.out.println("poll = " + deque.poll());
        System.out.println("poll = " + deque.poll());
        System.out.println("poll = " + deque.poll());
    }
}
