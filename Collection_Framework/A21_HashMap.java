package Collection_Framework;
import java.util.Map;
import java.util.HashMap;

public class A21_HashMap {
    public static void main(String args[])
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        //overrides same key value
        map.put("Two",23);

        //to avoid overriding
        if(!map.containsKey("Three"))
        {
            map.put("Three",33);
        }

        //to avoid overriding
        map.putIfAbsent("Six",6);

        System.out.println(map.containsValue(6));

        //removes using key values
        map.remove("Two");

        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());
        

        //iteration through map
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //iteration through keys
        for(String key:map.keySet())
        {
            System.out.println(key);
        }

        //iteration through values
        for(Integer value:map.values())
        {
            System.out.println(value);
        }
    }
    
}
