package atb10xTasks.LoopsandCondition.ProblemStatement;


/*
TODO: Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.
          Implement Bonus Calculation Logic:
     Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
 */


import java.util.Scanner;

public class atb10x_BonusCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        float Salary = sc.nextInt();
        System.out.println("Enter Salary");

        int YOE = sc.nextInt();
        System.out.println( "Bonus Based on Salary and Years of Experience is >> "+bonuslogic(Salary,YOE));
    }

    static double bonuslogic(float salary, int YOE ){
        double bonus =0;
        if(YOE < 1){
            return bonus ;
        } else if (YOE >=1 && YOE<= 3) {
            bonus = (salary*0.05) ;
            return bonus;

        } else if (YOE >= 4 && YOE <=6) {
            bonus = (salary*0.1) ;
            return bonus;

        } else {
            bonus = (salary*0.15) ;
            return bonus;
        }
    }
}
