import java.util.*;

public class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        // Input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print Matrix
        System.out.println("Matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Row-wise sum
        for(int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of row " + i + " = " + sum);
        }

        // Column-wise sum
        for(int j = 0; j < 3; j++) {
            int sum = 0;
            for(int i = 0; i < 3; i++) {
                sum += a[i][j];
            }
            System.out.println("Sum of column " + j + " = " + sum);
        }

        // Main diagonal
        int diag = 0;
        for(int i = 0; i < 3; i++) {
            diag += a[i][i];
        }
        System.out.println("Main diagonal sum = " + diag);
    }
}