import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]) {
        Queue<String> queue = new PriorityQueue<>();
        
        queue.add("INDIA");
        queue.add("America");
        queue.add("pakistan");

        //does not understand sorting so arranged in random manner but operation are performed on sorted set
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

        String head = queue.peek();
        System.out.println(head);

        String head1 = queue.poll();
        System.out.println(head1);

        System.out.println(queue);
}
}