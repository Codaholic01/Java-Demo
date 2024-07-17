package Operator.controlStatement;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int  fact = 1;

        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i=1; i<=n; i++){
            fact=fact*i;
        }

        System.out.println(" factorial number=" + fact);
    }
}
