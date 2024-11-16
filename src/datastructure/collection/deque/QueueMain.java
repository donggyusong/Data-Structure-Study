package datastructure.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueMain {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        //데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("poll = " + queue.poll());
        System.out.println("poll = " + queue.poll());
        System.out.println("poll = " + queue.poll());
        System.out.println(queue);

    }
}
