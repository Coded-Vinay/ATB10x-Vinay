package atb10xTasks.LoopsandCondition;

import java.util.Scanner;

public class atb10x_ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number >> ");
        int number = sc.nextInt();
        int rev = 0, n = 0, og, rem = 0;
        og = number;

        for (; number != 0; number /= 10) {
            n++;
        }
        number = og;
        for (int i = 1; i <= n; i++) {

            rem = number % 10;
            number /= 10;
            rev = (rev + rem);
            if (i < n) {
                rev *= 10;
            }
        }
        System.out.println( " Reverse of the given number is >> " + rev);

    }
}
