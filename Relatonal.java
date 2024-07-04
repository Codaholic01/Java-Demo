package Operator;

public class Relatonal {
    public static boolean Equal(int a , int b, int c ){
        return (a >b == a<c);
    }
    public static boolean Inqualties(int a ,int b , int c  ){
        return (a>b != a<c);
    }

    public static boolean Greater(int a , int b){
        return (a < b);
    }

    public static boolean GreaterThanEqual(int a , int b , int c){
        return (a>=c);

    }
    public static boolean Less(int a ,int b){
        return (a<b);
    }

    public static boolean LessThanEql(int a ,int b){
        return (a>=b);
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;


        System.out.println("Equal than" + " " +  Equal(a,b,c));
        System.out.println("Inqualities" + " " +  Inqualties(a,b,c));
        System.out.println("Greater" + " " +  Greater( a , b));
        System.out.println("GreaterThanEqual" + " " + GreaterThanEqual( a , b , c));


    }
}
