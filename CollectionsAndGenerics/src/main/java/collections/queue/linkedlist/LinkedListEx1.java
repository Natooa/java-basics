package collections.queue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        queue.add("zaur");
//        queue.add("nurdiyar");
//        queue.add("oleg");
//        queue.add("mariya");
//        queue.add("aleksandr");
        queue.offer("zaur");
        queue.offer("nurdiyar");
        queue.offer("oleg");
        queue.offer("mariya");
        queue.offer("aleksandr");
        System.out.println(queue);
        queue.remove("oleg");
        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());


//        System.out.println(queue);
    }
}
