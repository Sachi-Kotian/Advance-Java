package Collection_Framework;
import java.util.Queue;
import java.util.LinkedList;

public class A14_QueueLL {
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<>();
        //adds elements in queue
        q.offer(2);
        q.offer(4);
        q.offer(6);
        q.offer(8);
        q.offer(10);

        System.out.println(q);

        //remove element-also returns
        System.out.println(q.poll());

        //returns next element to be removed
        System.out.println(q.peek());

    }
    
}
