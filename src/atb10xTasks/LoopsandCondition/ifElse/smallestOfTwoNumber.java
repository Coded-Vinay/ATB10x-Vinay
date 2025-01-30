package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class smallestOfTwoNumber {

    public static void main(String[] args) {

        int a, b ;

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first Number");
        a= sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        smallestOfTwo(a,b);
    }

    public static  void smallestOfTwo (int a, int b){
         if (a>b){
             System.out.println( b + " << is Smallest of two numbers");
         } else{
             System.out.println( a + " << is Smallest of two numbers");
         }

    }
}
