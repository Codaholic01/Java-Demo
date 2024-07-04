package Operator;

public class Logical {
    public static boolean And(int x , int y , int z ){
        return ((x > y) && (x<z));
    }
    public static boolean Or(int x ,int y , int z){
        return ((x < y) || (x > z));
    }
    public static  boolean Not(int x , int y , int z){
        return ((x < y) !=( z > x));
    }

    public static void main(String[] args) {
         int  x = 5;
         int y = 9;
         int z = 10;

         System.out.println("AndOperator" + " " +  And(x ,y,z));
         System.out.println("OROperator" + " " +  Or(x,y,z));
         System.out.println("NotOperater" + " " +  Not(x ,y,z));
    }
}
