package Java;

import java.util.*;

class StringOp {
    // Data members
    String str;
    String msk;
    String nstr;

    // Constructor
    StringOp() {
        str = "";
        msk = "";
        nstr = "";
    }

    // Accept input
    void accept() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter original string: ");
        str = sc.nextLine().toLowerCase();
        
        System.out.print("Enter mask string: ");
        msk = sc.nextLine().toLowerCase();
    }

    // Form new string
    void form() {
        nstr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if character is NOT in mask
            if (msk.indexOf(ch) == -1) {
                nstr = nstr + ch;
            }
        }
    }

    // Display result
    void display() {
        System.out.println("Original String: " + str);
        System.out.println("New String: " + nstr);
    }
}

public class prac {
    public static void main(String[] args) {
        StringOp obj = new StringOp(); // object created

        obj.accept();   // input
        obj.form();     // processing
        obj.display();  // output
    }
}