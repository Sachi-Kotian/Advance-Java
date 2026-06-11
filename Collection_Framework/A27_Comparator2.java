package Collection_Framework;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class A27_Comparator2 {
    public static void main(String args[])
    {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("PineApple");
        fruits.add("Plum");

        // Comparator<String> comp=new Comparator<String>()
        // {
        //     @Override
        //     public int compare(String s1,String s2)
        //     {
        //         if(s1.length()>s2.length() ) 
        //             return 1;   //swaps
        //         else
        //             return -1;  //does not swap
        //     }
        // };

        Comparator<String> comp=(s1,s2)->s1.length()>s2.length()?1:-1;
        Collections.sort(fruits,comp);
        System.out.println(fruits);

    }
    
}
