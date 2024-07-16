package Operator.controlStatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number=" );
        int x = scn.nextInt();

        if (x % 2 == 0){
            System.out.println("this is even number");
        }else {
            System.out.println("this is odd number");
        }
    }
}
