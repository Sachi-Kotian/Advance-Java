// class A implements Runnable{
//     public void run(){
//         for(int i =0;i<5;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 Thread.currentThread().interrupt();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i =0;i<5;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 Thread.currentThread().interrupt();
//             }
//         }
//     }
// }

public class A09_Runnable {
    public static void main(String args[])
    {

        //can be implemented using anonymous class
        Runnable obj1=new Runnable(){

            public void run(){
                for(int i =0;i<5;i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        //Runnable is a functional interface so can use lambda expression
        Runnable obj2=() ->
        {
            for(int i =0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
    
}
