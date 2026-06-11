package Collection_Framework;
import java.util.Set;
import java.util.LinkedHashSet;

public class A18_LinkedHashSet {
    public static void main(String args[])
    {
        Set<Integer> set=new LinkedHashSet<>();

        set.add(32);
        set.add(10);
        set.add(5);
        set.add(500);

        System.out.println(set);

        //wont add duplicates
        set.add(5);

        //to remove elements
        set.remove(32);
        System.out.println(set);

        //to check an element
        System.out.println(set.contains(90));

        //to check if set is empty
        System.out.println(set.isEmpty());

        //set size
        System.out.println(set.size());

        //to empty a set
        set.clear();
        System.out.println(set);

    }
    
}
