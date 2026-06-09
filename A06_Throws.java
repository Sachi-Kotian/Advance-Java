class A{

    void show() throws ClassNotFoundException
    {
        Class.forName("B");
    }
}

public class A06_Throws {

    public static void main(String args[])
    {
        A obj=new A();

        try{
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found: "+e);
            e.printStackTrace();
        }
        
    }
    
}
