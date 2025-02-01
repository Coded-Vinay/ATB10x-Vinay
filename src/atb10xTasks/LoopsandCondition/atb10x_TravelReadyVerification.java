package atb10xTasks.LoopsandCondition;


/*

TODO: Find if a Person Can Travel Based on Visa Status and Age.

     Take the input from the user for
            Age (integer).
            Visa Status (String or boolean).

     Check Eligibility:
             :- If age is 18 or older and visa status is valid, the person can travel.
                Otherwise, the person cannot travel.

     Validation Criteria
             Age: - Must be a non-negative integer.
                    :- Should be greater than or equal to 18 to be eligible to travel.
             Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
                    :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa
 */

import java.util.Scanner;

public class atb10x_TravelReadyVerification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Do you have an valid Visa >> ");
        String visastatus = sc.nextLine();

        System.out.print("Enter Your age >> ");
        int age = sc.nextInt();

        boolean a = ageCheck(age);
        boolean b = visaValidation(visastatus.toLowerCase());

        if(a==true && b ==true){
            System.out.println(" You can travel");
        } else {
            System.out.println("You cannot Travel");
        }


    }

    static boolean ageCheck(int age) {

        if (age > 18) {
            return true;
        } else {
            System.out.println("You are underage to travel");
            return false;
        }
    }


    static boolean visaValidation(String VisaStatus) {

        if (VisaStatus.contains("yes")) {
            return true;
        } else {
            System.out.println("Visa not valid");
            return false;
        }
    }
}
