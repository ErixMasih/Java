import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int n,f=0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        // Input
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        // Search

        System.out.println("Enter the number to search:");
        n=sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if(a[i]==n)
            {
                f=1;
            }
        }
        if(f==1)
            System.out.println("Number is found");
        else 
              System.out.println("Number is not found");
    }
}
