package atb10xTasks.LoopsandCondition.ifElse;


/* TODO:  Convert Days into Years, Months, and Days.
  Take the Days Input from the User
  Define the conversion logic:
      :- Assume 1 year = 365 days.
      :- Assume 1 month = 30 days
      :- Convert the Days into Years, Month and days and Print it.
*/

import java.util.Scanner;

public class atb10x_DaysConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of days");
        int days = sc.nextInt();
        int OD =days;
        int months = 0;
        int year = 0;

        if (days > 365) {
            year = days / 365;
            days = days % 365;
            months = days / 30;
            days = days % 30;
        } else if (days > 30 && days <= 365) {
            months = days / 30;
            days = days % 30;
        }
        System.out.println(OD + " Days are equals to " +year + "  year " + months + " months and" + days + " days ");
    }
}
