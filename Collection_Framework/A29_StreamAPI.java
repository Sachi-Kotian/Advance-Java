package Collection_Framework;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class A29_StreamAPI {
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(2,5,4,7,9,10);

        //Stream<Integer> s1=nums.stream();
        //s1.forEach(n->System.out.println(n));

        int result=nums.stream()
                        .filter(n->n%2==0)  //returns stream
                        .map(n->n*2)        //returns stream
                        .reduce(0,(c,e)->c+e);  //returns single value

        System.out.println(result);

    List<Integer> list=Arrays.asList(100,9,78,55,34);
    Stream<Integer> sortList=list.stream()
                                .filter(n->n%2==0)
                                .sorted();
                            
        sortList.forEach(n->System.out.println(n));



    }
    
}
