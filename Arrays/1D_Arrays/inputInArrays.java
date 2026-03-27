import java.util.*;

public class inputInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        // Input
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}

