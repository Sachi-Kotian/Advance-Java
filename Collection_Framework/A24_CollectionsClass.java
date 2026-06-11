package Collection_Framework;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class A24_CollectionsClass {
    public static void main(String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(99);
        list.add(80);
        list.add(4);
        list.add(4);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,4));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);


    }
    
}
