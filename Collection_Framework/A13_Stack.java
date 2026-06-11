package Collection_Framework;
import java.util.Stack;

public class A13_Stack {
    public static void main(String args[])
    {
        Stack<String> animals=new Stack<>();

        //pushing elements on stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Tiger");
        animals.push("Cat");

        System.out.println(animals);

        //returns top element
        System.out.println(animals.peek());

        //removes top element
        animals.pop();
        System.out.println(animals);
    }

    

    
}
