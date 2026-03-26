import java.util.*;

public class smallestIntUsinggArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[] = new int [10];

        //Input
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        //Print
        for(int i=1;i<10;i++)
        {
            System.out.println("The Array is" + a[i]);
        }

        //Min term
        int min=a[0];
        for(int i=1;i<10;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
         System.out.println("Min Term :" + min);
    }
}
