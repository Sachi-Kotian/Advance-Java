package Collection_Framework;
import java.util.Arrays;

public class A23_ArrayClass {
    public static void main(String args[])
    {
        int[] arr1={1,20,33,46,78,99,151};

        //works only on sorted arrays
        int index=Arrays.binarySearch(arr1,78);

        System.out.println(index);

        int[] arr2={39,66,51,9,22,88};
        for(int i:arr2)
        {
            System.out.println(i);
        }
        //applies quick sort
        Arrays.sort(arr2);
        System.out.println("Sorted array");
        for(int i:arr2)
        {
            System.out.println(i);
        }

        int[] arr3=new int[4];
        Arrays.fill(arr3,9);
        for(int n:arr3)
        {
            System.out.println(n);
        }
    }
    
}
