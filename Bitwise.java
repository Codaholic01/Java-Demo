package Operator;

public class Bitwise {

        public static void main(String[] args) {
            int a = 5;
            int b = 3;

            // Bitwise AND (&)
            int resultAnd = a & b; // 0001 (1 in decimal)
            System.out.println("a & b = " + resultAnd);

            // Bitwise OR (|)
            int resultOr = a | b; // 0111 (7 in decimal)
            System.out.println("a | b = " + resultOr);

            // Bitwise XOR (^)
            int resultXor = a ^ b; // 0110 (6 in decimal)
            System.out.println("a ^ b = " + resultXor);

            // Bitwise NOT (~)
            int resultNotA = ~a; // 1111 1111 1111 1111 1111 1111 1111 1010 (-6 in decimal)
            System.out.println("~a = " + resultNotA);

            // Left Shift (<<)
            int resultLeftShift = a << 1; // 1010 (10 in decimal)
            System.out.println("a << 1 = " + resultLeftShift);

            // Right Shift (>>)
            int resultRightShift = a >> 1; // 0010 (2 in decimal)
            System.out.println("a >> 1 = " + resultRightShift);

            // Unsigned Right Shift (>>>)
            int c = -5; // 1111 1111 1111 1111 1111 1111 1111 1011 in binary
            int resultUnsignedRightShift = c >>> 1; // 0111 1111 1111 1111 1111 1111 1111 1101 (2147483645 in decimal)
            System.out.println("c >>> 1 = " + resultUnsignedRightShift);
        }


}
