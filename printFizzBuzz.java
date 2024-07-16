//Write a program that prints numbers from 1 to 100. For multiples of 5, print "Fizz"; for multiples of 7, print "Buzz"; and for multiples of both, print "FizzBuzz".


package Operator.controlStatement;

import java.util.Scanner;

public class printFizzBuzz {
    public static void main(String[] args) {


        for (int i=0; i<=100; i++){
            if ((i % 5==0)&&( i%7==0)){
                System.out.println("FizzBuzz");
            } else if (i % 5==0 ) {
                System.out.println("Fizz");
            } else if (i%7==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

    }
}
