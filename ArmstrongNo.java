package Operator.controlStatement;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {

        int  arm=0, rem,c;
        System.out.println("Enter the number to check the armstrong number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        c=n;
        while (n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }if (c==arm){
            System.out.println("this is armstrong Number");
        }else {
            System.out.println("this is not armstrong Number");
        }
    }
}
