package atb10xTasks.LoopsandCondition.ProblemStatement;

import java.util.Scanner;

public class atb10x_GradeSystemUsingIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = input.nextInt();

        if (marks < 100 && marks > 0) {
            gradelogic(marks);
        }
    }

    public static void gradelogic(int marks) {

        if (marks <= 100 && marks >= 90) {
            System.out.println("Grade >> A+");
        } else if (marks <= 89 && marks >= 80) {
            System.out.println("Grade >> A");
        } else if (marks <= 79 && marks >= 70) {
            System.out.println("Grade >> B");
        } else if (marks <= 69 && marks >= 60) {
            System.out.println("Grade >> C");
        } else if (marks <= 59 && marks >= 50) {
            System.out.println("Grade >> D");
        } else if (marks <= 49 && marks >= 40) {
            System.out.println("Grade >> E");
        } else {
            System.out.println("Grade >> Fail");
        }
    }
}
