import java.util.*;

public class greatestIntUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];

        //input
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        //printing the array
        for(int i=0;i<10;i++)
        {
            System.out.println("The Array is:" + a[i]);
        }
        //Max Term
        int max=a[0];
        for(int i=1;i<10;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Max Term:"+max);
    }
}
