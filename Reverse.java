package Operator.controlStatement;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int r;
        System.out.println("Enter the  number for the reverse");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n>0){
            r =n%10;
            System.out.println( r);
            n= n/10;
        }
    }
}
