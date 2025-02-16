package atb10xTasks.LoopsandCondition.feb7thAssignments;

import java.util.Scanner;

public class primenumberValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Number  >> ");
        int n = sc.nextInt();

        primeNumberValidation(n);

    }

    static void primeNumberValidation(int number) {
        int factor = 0;
        for (int i = 1; i <= number; i++) {
            if (factor > 2) {
                break;
            }
            if (number % i == 0) {
                factor++;
            }
        }
        if (factor > 2) {
            System.out.println("Number is not prime");
        } else {

            System.out.println("Number is prime");
        }

    }
}
