package atb10xTasks.LoopsandCondition.feb7thAssignments;

import java.util.Scanner;

public class pyramidPatttern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of triangle >> ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            int space = n - i;

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            System.out.println();
            i++;
            space--;
        }
    }
}
