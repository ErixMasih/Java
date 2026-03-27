import java.util.*;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        // Input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}