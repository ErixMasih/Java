import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        
        int a[] = new int[n];
        
        // Input
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Selection Sort
        for(int i = 0; i < n - 1; i++) {
            int min = i;
            
            for(int j = i + 1; j < n; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        
        // Output
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}