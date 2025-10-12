import java.util.*;

public class Queues {
    public static void main(String[] args) {
       Queue<Integer>  queue = new LinkedList<>();
       queue.add(10);
       queue.add(null);

         
       System.out.println(queue);
       System.out.println(queue.remove());
       System.out.println(queue.peek());
    }
}
