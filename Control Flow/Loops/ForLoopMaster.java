public class ForLoopMaster {
    public static void main(String[] args) {

        // -------------------------------
        // 1. BASIC FOR LOOP
        // -------------------------------
        System.out.println("1. Basic For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }


        // -------------------------------
        // 2. REVERSE LOOP
        // -------------------------------
        System.out.println("\n2. Reverse Loop:");

        for (int i = 5; i >= 1; i--) {
            System.out.println("Number: " + i);
        }


        // -------------------------------
        // 3. MULTIPLE VARIABLES
        // -------------------------------
        System.out.println("\n3. Multiple Variables:");

        for (int i = 1, j = 5; i <= 5; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }


        // -------------------------------
        // 4. INFINITE LOOP (CONTROLLED)
        // -------------------------------
        System.out.println("\n4. Controlled Infinite Loop:");

        for (int i = 1; ; i++) { // no condition → infinite
            System.out.println("Value: " + i);

            if (i == 3) {
                break; // stops loop
            }
        }


        // -------------------------------
        // 5. CONTINUE (SKIP EVEN NUMBERS)
        // -------------------------------
        System.out.println("\n5. Skip Even Numbers:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }

            System.out.println("Odd Number: " + i);
        }


        // -------------------------------
        // 6. NESTED FOR LOOP (PATTERN)
        // -------------------------------
        System.out.println("\n6. Star Pattern:");

        for (int row = 1; row <= 3; row++) {
            String pattern = "";

            for (int col = 1; col <= row; col++) {
                pattern += "* ";
            }

            System.out.println(pattern);
        }


        // -------------------------------
        // 7. REAL-LIFE LOGIC (SUM)
        // -------------------------------
        System.out.println("\n7. Sum Calculation:");

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println("Added " + i + ", Sum = " + sum);
        }


        // -------------------------------
        // 8. ENHANCED FOR LOOP (ARRAY)
        // -------------------------------
        System.out.println("\n8. Enhanced For Loop:");

        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) { // for-each loop
            System.out.println("Value: " + num);
        }


        // -------------------------------
        // 9. NESTED + BREAK (ADVANCED)
        // -------------------------------
        System.out.println("\n9. Nested Loop with Break:");

        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 3; inner++) {

                if (inner == 2) {
                    break; // breaks inner loop only
                }

                System.out.println("Outer: " + outer + ", Inner: " + inner);
            }
        }


        System.out.println("\n--- END OF PROGRAM ---");
    }
}