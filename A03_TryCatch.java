public class C10_TryCatch {
    public static void main(String args[])
    {
        //int i=0;    will give arithmetic exception
        int i=2;
        
        int[] arr=new int[5];
        String s=null;

        try{
            int j=10/i;
            //System.out.println(arr[5]); array index out of bounds exception
            System.out.println(arr[0]);
            System.out.println(s.length()); //null pointer exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds "+e);
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: "+e);
        }
        finally
        {
            System.out.println("This block will always execute");
        }
    }
    
}
