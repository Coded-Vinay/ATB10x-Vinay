package atb10xTasks.LoopsandCondition;


/*
TODO:  18 )  Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
    Implement Rate Structure:
    Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit
 */


import java.util.Scanner;

public class atb10x_ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed >> ");
        int consumption = sc.nextInt();

        double bill = 0;

        if (consumption <= 100) {
            bill = (consumption * 0.5);

        } else if (consumption >= 101 && consumption <= 200) {
            bill = (100 * .5) + ((consumption - 100) * .75);
        } else if (consumption >= 201 && consumption <= 300) {
            bill = (100 * .5) + (100 * .75) + ((consumption - 200) * 1.20);
        } else {
            bill = (100 * .5) + (100 * .75) + (100 * 1.2) + ((consumption - 300) * 1.50);

        }

        System.out.println("Your bill amount for consumption of " + consumption +  " is >>  " + bill + "₹");


    }


}
