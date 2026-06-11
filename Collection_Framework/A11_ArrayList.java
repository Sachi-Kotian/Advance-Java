package Collection_Framework;
import java.util.List;
import java.util.ArrayList;

public class A11_ArrayList {
    public static void main (String args[])
    {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        //to add element by index
        list.add(3,35);
        System.out.println(list);

        ArrayList<Integer> newList=new ArrayList<>();
        newList.add(90);
        newList.add(100);
        newList.add(110);

        //to append new list
        list.addAll(newList);
        System.out.println(list);

        //to access an element using index
        System.out.println(list.get(5));
        
        //to remove element using index
        list.remove(3);
        System.out.println(list);
        //to remove using element
        list.remove(Integer.valueOf(110));
        System.out.println(list);
        
        //to change a value in list
        list.set(2,37);
        System.out.println(list);

        //checks for element in list
        System.out.println(list.contains(80));
        System.out.println(list.contains(99));

        //for iteration
        System.out.println("for loop");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //advanced loop for iteration
        System.out.println("advanced loop");
        for(Integer m:list)
        {
            System.out.println(m);
        }
        




        
    }
    
}
