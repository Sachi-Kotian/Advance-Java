package Collection_Framework;
import java.util.ArrayDeque;

public class A16_ArrayDeque {
    public static void main(String args[])
    {
        ArrayDeque<Integer> adq=new ArrayDeque<>();

        adq.offer(12);
        adq.offerFirst(33);

        //same as offer
        adq.offerLast(44);
        adq.offer(9);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());//same as peek
        System.out.println(adq.peekLast());

        adq.poll();
        System.out.println(adq);
        adq.pollFirst(); //same as poll
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);
    }
    
}
