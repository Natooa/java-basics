package collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(10);
        pq.add(8);
        // 1 4 7 8 10
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}
