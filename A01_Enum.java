import java.util.Scanner;
enum Notes{
    ten("ochre"),
    twenty("green"),
    fifty("blue"),
    hundred("purple");

    //field
    private String color;

    //constructor
    private Notes(String color){
        this.color=color;
    }

    //method
    public String getColor(){
        return this.color;
    }


}

public class C08_Enum {
    public static void main(String args[])
    {
        //prints individual enum constant
        Notes n0=Notes.ten;
        System.out.println(n0);
        System.out.println(n0.getColor());

        //prints all enum constants
        Notes nn[]=Notes.values();
        for(Notes m:nn)
        {
            System.out.println(m +" : "+m.ordinal()+" : "+m.getColor());
        }
        Scanner sc=new Scanner(System.in);

        //converts string to enum constant
        System.out.println("Enter a note");
        String s=sc.next();
        Notes n1=Notes.valueOf(s);
        System.out.println(n1.getColor());

        //if-else ladder with enum
        if(n1==Notes.fifty)
            System.out.println("You have entered fifty");
        else if(n1==Notes.hundred)
            System.out.println("You have entered hundred");
        else
            System.out.println("You have entered a different note");
    
    //switch case with enum
        switch(n1)
        {
            case ten:
                System.out.println("You have entered ten");
                break;
            case twenty:
                System.out.println("You have entered twenty");
                break;
            case fifty:
                System.out.println("You have entered fifty");
                break;
            case hundred:
                System.out.println("You have entered hundred");
                break;
            default:
                System.out.println("You have entered a different note");
        }

    }
    
}
