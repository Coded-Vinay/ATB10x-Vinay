package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class atb10x_AgeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age ==>>");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Enter a valid age");
        } else if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenagaer");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }
    }
}
