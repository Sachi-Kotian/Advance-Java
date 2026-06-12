package Collection_Framework;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Optional;


public class A31_OptionalClass {
    public static void main(String args[])
    {
        List<String> birds=Arrays.asList("Duck","Hen","Pigeon","Parrot");

        // Optional<String> result=birds.stream()
        //                     .filter(str->str.contains("w"))
        //                     .findFirst();
        // System.out.println(result.orElse("Not Found"));

        String result=birds.stream()
                            .filter(str->str.contains("w"))
                            .findFirst()
                            .orElse("Cannot find");
                            System.out.println(result);
    }
    
}
