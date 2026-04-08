public class AlphabetPatterns {
    public static void main(String[] args) {
        int n = 5;

        // 1. Straight Alphabet
        System.out.println("Alphabet Line:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        // 2. Alphabet Square
        System.out.println("\n\nAlphabet Square:");
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // 3. Alphabet Triangle
        System.out.println("\nAlphabet Triangle:");
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // 4. Continuous Alphabet Triangle
        System.out.println("\nContinuous Triangle:");
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // 5. Inverted Alphabet Triangle
        System.out.println("\nInverted Triangle:");
        for (int i = n; i >= 1; i--) {
            char ch2 = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch2 + " ");
                ch2++;
            }
            System.out.println();
        }

        // 6. Pyramid Alphabet
        System.out.println("\nAlphabet Pyramid:");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            char ch3 = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch3);
                ch3++;
            }

            ch3 -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch3);
                ch3--;
            }

            System.out.println();
        }

        // 7. Diagonal Alphabet
        System.out.println("\nDiagonal Alphabet:");
        for (int i = 1; i <= n; i++) {
            char ch4 = 'A';
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    System.out.print(ch4 + " ");
                else
                    System.out.print("  ");
                ch4++;
            }
            System.out.println();
        }

        // 8. X Alphabet Pattern
        System.out.println("\nX Alphabet:");
        for (int i = 1; i <= n; i++) {
            char ch5 = 'A';
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print(ch5 + " ");
                else
                    System.out.print("  ");
                ch5++;
            }
            System.out.println();
        }
    }
}