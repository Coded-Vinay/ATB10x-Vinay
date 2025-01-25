package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class ifElse_identifyNumIsEvenOrOdd {
    public static void main(String[] args) {

        // Create a program >> Take input using Scanner class >> Identify number is even or odd
        System.out.println("Enter the number (integer only)");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Entered number is Even");
        }else {
            System.out.println("Entered number is Odd");
        }

    }
}
