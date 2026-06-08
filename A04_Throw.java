public class C11_Throw {
    public static void main(String args[])
    {
        int i=20;
        
        try{
            int j=18/i;
            if(j==0)
                throw new ArithmeticException("Result is zero");
            else
                System.out.println("Result: "+j);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Default output: "+e);
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: "+e);
        }
    }   
    
}
