import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QUEUE {
    public static void main(String[] args){
        //FIFO structure : First In First Out

        Queue<String> queue = new LinkedList<>();

        queue.offer("this is to be removed");
        queue.offer("hello");
        queue.offer("my");
        queue.offer("name");
        queue.offer("is");
        queue.offer("ramu");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

    Queue<String> queue2 = new PriorityQueue<>();

        queue2.offer("hello");
        queue2.offer("my");
        queue2.offer("name");
        queue2.offer("is");
        queue2.offer("ramu");
        System.out.println(queue2.peek());
        queue2.poll();
        System.out.println(queue2);

    Queue<String> queue3 = new PriorityQueue<>(Collections.reverseOrder());

        queue3.offer("hello");
        queue3.offer("my");
        queue3.offer("name");
        queue3.offer("is");
        queue3.offer("ramu");
        System.out.println(queue3.peek());
        queue3.poll();
        System.out.println(queue3);
    }
}
