package atb10xTasks.LoopsandCondition.feb7thAssignments;

import java.util.Scanner;

public class factorialOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Number  >> ");
        int n = sc.nextInt();

        factorial(n);
    }


    static void factorial(int number) {
        int res = 1;
        for (int i = number; i >= 1; i--) {
            res *= i;
        }
        System.out.println("Factorial is " + res);

    }
}
