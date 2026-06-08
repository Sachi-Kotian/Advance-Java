@FunctionalInterface
interface Chocolate{
    void brand(int price);
}

@FunctionalInterface
interface Calculator{
    int add(int a,int b);
}

public class C09_LambdaExpression {
    public static void main(String args[])
    {
        Chocolate c=price->
        {
            System.out.println("Dairy Milk - Price: " + price);
        };
        c.brand(20);

        Calculator cal=(a,b)-> a+b;
        
        int result=cal.add(10, 20);
        System.out.println("Result: " + result);
    }
    
}
