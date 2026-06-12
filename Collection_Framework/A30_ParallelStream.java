package Collection_Framework;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class A30_ParallelStream {
    public static void main(String args[])
    {
        int size=10000;
        List<Integer> nums=new ArrayList<>();

        Random ran=new Random();

        for(int i=0;i<size;i++)
        {
            nums.add(ran.nextInt(100));
        }
        
        long startSeq=System.currentTimeMillis();
        int sum1=nums.stream()
                        .map(n->{
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){

                            }
                            return n*2;
                        })
                        //alternative for reduce method
                        .mapToInt(n->n)
                        .sum();
        long endSeq=System.currentTimeMillis();

        System.out.println(sum1);
        System.out.println(endSeq-startSeq);

        long startPara=System.currentTimeMillis();
        int sum2=nums.parallelStream()
                        .map(n->{
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){

                            }
                            return n*2;
                        })
                        .mapToInt(n->n)
                        .sum();
        long endPara=System.currentTimeMillis();
        System.out.println(endPara-startPara);

        System.out.println(sum2);
    }
    
}
