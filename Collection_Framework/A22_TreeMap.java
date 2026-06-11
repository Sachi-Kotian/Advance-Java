package Collection_Framework;
import java.util.Map;
import java.util.TreeMap;

public class A22_TreeMap {
    public static void main(String args[])
    {

        Map<String,Integer> map=new TreeMap<>();

        //added according to keys order
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map);


    }
    
}
