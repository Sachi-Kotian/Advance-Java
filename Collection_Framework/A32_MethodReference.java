package Collection_Framework;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class A32_MethodReference {
    public static void main(String args[])
    {
        List<String> names=Arrays.asList("Diya","Sahil","Mira");


        //normal way
        // List<String> list=names.stream()
        //                         .map(str->str.toUpperCase())
        //                         .toList();

        // System.out.println(list);

        //method reference way
        List<String> list=names.stream()    
                            .map(String::toUpperCase)
                            .toList();

        list.forEach(System.out::println);
    }
    
}
