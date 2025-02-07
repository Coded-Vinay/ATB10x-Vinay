package atb10xTasks.LoopsandCondition.ProblemStatement;

import java.util.Scanner;

public class atb10x_LoanEligibilityCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name >> ");
        String name = sc.nextLine();

        System.out.print("Enter the Age >> ");
        int age = sc.nextInt();
        System.out.print("Enter the Salary >> ");
        float salary = sc.nextInt();
        System.out.print("Enter the Credit Score >>");
        int creditscore = sc.nextInt();
        Boolean a = ageValidation(age);
        Boolean b = salaryValidation(salary);
        Boolean c = creditScoreValidation(creditscore);


        if (a == true && b == true && c == true) {
            System.out.println( "Hello " + name + " you are eligible for the loan, please proceed with the application");
        } else {
            System.out.println( "Sorry " + name + " you are not Eligible for the loan");
        }
    }

    static boolean ageValidation(int age) {
        if (age < 80 && age > 18) {
            return true;
        } else {
            System.out.println("Age is invalid");
            return false;
        }
    }

    static boolean salaryValidation(float salary) {
        if (salary > 30000) {
            return true;
        } else {
            {
                System.out.println("Not eligible for loan due to not matching the Minimun salary criteria");
                return false;
            }
        }
    }

    static boolean creditScoreValidation(int CreditScore) {

        if (CreditScore >= 650 && CreditScore <=850) {
            return true;
        } else {
            System.out.println("Not eligible for loan due to bad credit Score");
            return false;
        }
    }

}
