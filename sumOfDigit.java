package Operator.controlStatement;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the integer");
        int num= scn.nextInt();
        int sum=0;

        while (num !=0){
            sum+=num %10;
            num /=10;

        }
        System.out.println("sum of digit:" + sum);
    }
}
