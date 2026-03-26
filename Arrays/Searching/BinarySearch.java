import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int n, f = 0, l = 0, u = 9, mid;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        // Input (sorted array required)
        System.out.println("Enter 10 elements in sorted order:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        // Search
        System.out.println("Enter the number to search:");
        n = sc.nextInt();

        while (l <= u) {
            mid = (l + u) / 2;

            if (a[mid] == n) {
                f = 1;
                break;
            } else if (n < a[mid]) {
                u = mid - 1;   // search left
            } else {
                l = mid + 1;   // search right
            }
        }

        if (f == 1)
            System.out.println("Number is found");
        else
            System.out.println("Number is not found");
    }
}