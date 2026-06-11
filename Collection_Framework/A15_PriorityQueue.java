package Collection_Framework;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class A15_PriorityQueue {
    public static void main(String args[])
    {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(20);
        pq.offer(360);
        pq.offer(54);

        System.out.println(pq);

        //remove element
        System.out.println(pq.poll());
        System.out.println(pq);

        //next element to be removed
        System.out.println(pq.peek());

    }
    
}
