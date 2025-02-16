package atb10xTasks.LoopsandCondition.feb7thAssignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Number  >> ");
        int n = sc.nextInt();
        System.out.print(" Enter the Range >> ");
        int r = sc.nextInt();

        table(n, r);


    }


    static void table(int number, int range) {

        for (int i = 1; i <= range; i++)
            System.out.println(number + " x " + i + " =  " + number * i);


    }
}
