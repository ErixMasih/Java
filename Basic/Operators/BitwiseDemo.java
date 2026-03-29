package Operators;

public class BitwiseDemo {
        public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println(a & b); // 1 (AND)
        System.out.println(a | b); // 7 (OR)
        System.out.println(a ^ b); // 6 (XOR)
        System.out.println(~a);    // -6 (NOT)
        System.out.println(a << 1); // 10 (Left shift)
        System.out.println(a >> 1); // 2 (Right shift)
    }
}
