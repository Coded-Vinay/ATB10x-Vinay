package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class smallestOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first Number");
       int a= sc.nextInt();
        System.out.println("Enter Second Number");
       int b=sc.nextInt();
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
