public class WhileLoopMaster {
    public static void main(String[] args) {

        // -------------------------------
        // 1. BASIC WHILE LOOP
        // -------------------------------
        System.out.println("1. Basic While Loop:");

        int i = 1; // initialization
        while (i <= 5) { // condition
            System.out.println("Number: " + i);
            i++; // increment (VERY IMPORTANT)
        }


        // -------------------------------
        // 2. INFINITE LOOP (CONTROLLED)
        // -------------------------------
        System.out.println("\n2. Controlled Infinite Loop:");

        int x = 1;
        while (true) { // always true → infinite loop
            System.out.println("Value: " + x);
            x++;

            if (x > 3) {
                break; // stops the loop
            }
        }


        // -------------------------------
        // 3. WHILE LOOP (PASSWORD CHECK)
        // -------------------------------
        System.out.println("\n3. Password Check:");

        String correctPassword = "1234";
        String[] inputs = {"1111", "2222", "1234"}; // simulated inputs
        int attempts = 0;

        while (attempts < inputs.length) {
            System.out.println("Trying: " + inputs[attempts]);

            if (inputs[attempts].equals(correctPassword)) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong Password");
            }

            attempts++;
        }


        // -------------------------------
        // 4. CONTINUE (SKIP EVEN NUMBERS)
        // -------------------------------
        System.out.println("\n4. Skip Even Numbers:");

        int num = 0;

        while (num < 10) {
            num++;

            if (num % 2 == 0) {
                continue; // skip even numbers
            }

            System.out.println("Odd Number: " + num);
        }


        // -------------------------------
        // 5. NESTED WHILE LOOP (PATTERN)
        // -------------------------------
        System.out.println("\n5. Star Pattern:");

        int row = 1;

        while (row <= 3) {
            int col = 1;
            String pattern = "";

            while (col <= row) {
                pattern += "* ";
                col++;
            }

            System.out.println(pattern);
            row++;
        }


        // -------------------------------
        // 6. DO-WHILE COMPARISON
        // -------------------------------
        System.out.println("\n6. Do-While Example:");

        int y = 10;

        do {
            System.out.println("Runs at least once: " + y);
            y++;
        } while (y < 5); // condition false, but runs once


        // -------------------------------
        // 7. REAL-LIFE LOGIC (SUM UNTIL LIMIT)
        // -------------------------------
        System.out.println("\n7. Sum Until Limit:");

        int sum = 0;
        int n = 1;

        while (sum <= 20) {
            sum += n;
            System.out.println("Added " + n + ", Sum = " + sum);
            n++;
        }


        // -------------------------------
        // 8. NESTED + BREAK (ADVANCED)
        // -------------------------------
        System.out.println("\n8. Nested Loop with Break:");

        int outer = 1;

        while (outer <= 3) {
            int inner = 1;

            while (inner <= 3) {
                if (inner == 2) {
                    break; // breaks inner loop only
                }

                System.out.println("Outer: " + outer + ", Inner: " + inner);
                inner++;
            }

            outer++;
        }


        // -------------------------------
        // 9. BOOLEAN CONTROL LOOP (ADVANCED)
        // -------------------------------
        System.out.println("\n9. Boolean Controlled Loop:");

        boolean running = true;
        int counter = 1;

        while (running) {
            System.out.println("Counter: " + counter);
            counter++;

            if (counter > 3) {
                running = false; // stop loop using boolean
            }
        }


        System.out.println("\n--- END OF PROGRAM ---");
    }
}