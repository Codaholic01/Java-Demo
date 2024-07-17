package Operator.controlStatement;

import java.util.Scanner;

public class palindromeNo {
    public static void main(String[] args) {
        int n , s=0, c,r;
        System.out.println("Enter the integer no");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        c = n;
        while (n>0){
            r = n%10;
            s = s*10+r;
            n = n/10;
        }if (c == s){
            System.out.println("this is palindrom number");
        }else {
            System.out.println("this is not palidrome number");
        }
    }
}
