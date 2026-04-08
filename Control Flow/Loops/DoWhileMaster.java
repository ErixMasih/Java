public class DoWhileMaster {
    public static void main(String[] args) {

        // -------------------------------
        // 1. BASIC DO-WHILE LOOP
        // -------------------------------
        System.out.println("1. Basic Do-While:");

        int i = 1;

        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);


        // -------------------------------
        // 2. RUNS AT LEAST ONCE
        // -------------------------------
        System.out.println("\n2. Runs At Least Once:");

        int x = 10;

        do {
            System.out.println("This runs even if condition is false: " + x);
        } while (x < 5); // false but still executes once


        // -------------------------------
        // 3. CONTROLLED INFINITE LOOP
        // -------------------------------
        System.out.println("\n3. Controlled Infinite Loop:");

        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;

            if (count > 3) {
                break; // stops loop
            }

        } while (true);


        // -------------------------------
        // 4. CONTINUE EXAMPLE
        // -------------------------------
        System.out.println("\n4. Skip Even Numbers:");

        int num = 0;

        do {
            num++;

            if (num % 2 == 0) {
                continue; // skips even numbers
            }

            System.out.println("Odd Number: " + num);

        } while (num < 10);


        // -------------------------------
        // 5. PASSWORD CHECK (REAL-LIFE)
        // -------------------------------
        System.out.println("\n5. Password Check:");

        String correctPassword = "1234";
        String[] inputs = {"1111", "2222", "1234"};
        int attempts = 0;

        do {
            System.out.println("Trying: " + inputs[attempts]);

            if (inputs[attempts].equals(correctPassword)) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong Password");
            }

            attempts++;

        } while (attempts < inputs.length);


        // -------------------------------
        // 6. NESTED DO-WHILE LOOP
        // -------------------------------
        System.out.println("\n6. Star Pattern:");

        int row = 1;

        do {
            int col = 1;
            String pattern = "";

            do {
                pattern += "* ";
                col++;
            } while (col <= row);

            System.out.println(pattern);
            row++;

        } while (row <= 3);


        // -------------------------------
        // 7. BOOLEAN CONTROL LOOP
        // -------------------------------
        System.out.println("\n7. Boolean Controlled Loop:");

        boolean running = true;
        int c = 1;

        do {
            System.out.println("Counter: " + c);
            c++;

            if (c > 3) {
                running = false;
            }

        } while (running);


        System.out.println("\n--- END OF PROGRAM ---");
    }
}