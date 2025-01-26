package atb10xTasks.LoopsandCondition;

import java.util.Scanner;

public class factorialOf {

    // Program to find the factorial of thr given number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        factorial(n);
    }

    static void factorial(int number) {

        long f = 0;
        long k = number;

        for (int i = number - 1; i >= 1; i--) {
            f = k * i;
            k = f;
        }
        System.out.println(f);
    }
}

