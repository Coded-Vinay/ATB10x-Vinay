package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class largestOfThreeusingIfElse {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int a = Sc.nextInt();

        System.out.println("Enter the first number ");
        int b = Sc.nextInt();

        System.out.println("Enter the first number ");
        int c = Sc.nextInt();

        lasrgestofthree(a, b, c);
    }


    public static void lasrgestofthree(int a, int b, int c) {

        if ((a > b) && (b > c)) {
            System.out.println("Largest of three is >> " + a);
        } else if ((a < b) && (b > c)) {
            System.out.println("Largest of three is >> " + b);
        } else {
            System.out.println("Largest of three is >> " + c);
        }
    }

    public static void smallestOfThree(int a, int b, int c) {
        if ((a > b) && (b > c)) {
            System.out.println("Smallest of three is >> " + c);
        } else if ((a < b) && (b < c)) {
            System.out.println("Smallest of three is >> " + a);
        } else {
            System.out.println("Smallest of three is >> " + b);
        }

    }


}

