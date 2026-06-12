package Collection_Framework;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class A28_forEach {
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(1,4,5,88,90);

        //Consumer is a functional interface so lambda expressions can be used
        // Consumer<Integer> con=new Consumer<Integer>() {
            
        //         public void accept(Integer n)
        //         {
        //             System.out.println(n);
        //         }
            
        // };
        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));

    
}
    
}
