package Operator;

public class Aithematic {
    public static int Add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        if (b == 0) {
            System.out.println("divide is not valid");
            return 0;
        } else {
            return (double) a / b;
        }

    }

    public static int mod(int a , int b){
        return a%b;
    }





    public static void main(String[] args) {

       int a = 10;
       int b = 5;

       System.out.println("Addition" + " " + Add(a,b));
       System.out.println("Subtract" + " " + sub(a,b));
       System.out.println("Product" + " " +  mult(a,b));
       System.out.println("Division" + " " +  div(a,b));
       System.out.println("modulus" + " " +  mod(a,b));
    }
}