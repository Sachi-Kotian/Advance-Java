class MyException extends Exception{
    public MyException(String message)
        {
            super(message);
        }
    
}

public class A05_CustomException {
    public static void main(String args[])
    {
        int i=20;

        try{
            int j=18/i;
            if(j==0)
            {
                throw new MyException("Answer should not be zero");
            }
        }
        catch(MyException e)
        {
            System.out.println("Custom Exception: "+e);
        }
        catch(Exception e)
        {
            System.out.println("An error occurred: "+e);
        }


    }
    
}
