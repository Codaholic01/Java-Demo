package Operator.controlStatement;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        int count =0;
        System.out.println("Enter the integer number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i =1; i<=n; i++){
            if (n%i==0){
                count ++;
            }
        }if (count ==2){
            System.out.println("this is prime number");
        }else {
            System.out.println("this is not prime number");
        }
    }
}
