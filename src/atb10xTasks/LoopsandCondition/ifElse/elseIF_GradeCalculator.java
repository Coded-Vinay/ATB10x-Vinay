package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class elseIF_GradeCalculator {
    public static void main(String[] args) {

        System.out.println("Enter theS Score");

        // Write a program to convert Score range into Grade base on the given Condition
        // score >= 90 >> Grade = A and so on......

        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();
        char grade = 'G';

        if (Score >= 90 && Score < 100) {
            grade = 'A';
        } else if (Score >= 80 && Score < 90) {
            grade = 'B';
        } else if (Score >= 70 && Score < 80) {
            grade = 'C';
        } else if (Score >= 60 && Score < 70) {
            grade = 'D';
        } else if (Score <= 0 || Score > 100) {
            System.out.println( Score + " You are a God level student, Please don't take the test again");
        } else {
            grade = 'F';
        }
        System.out.println(" Score " +Score+ " falls in "+ grade +" Grade category");
        sc.close();

    }


}
