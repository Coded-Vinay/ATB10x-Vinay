package atb10xTasks.LoopsandCondition.ProblemStatement;

import java.util.Scanner;

public class atb10x_ATMWithdrawalSimulation {
    public static void main(String[] args) {
        int account_Balance = 10000;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw >> $ ");
        int withdrawals = sc.nextInt();

        if ((withdrawals > 0) && (withdrawals % 100 == 0) && (withdrawals<10000)) {
            atmLogic(account_Balance, withdrawals);
        } else {
            System.out.print("Please ensure withdrawal amount is multiple of 100");
        }
    }

    public static void atmLogic(int account_Balance, int withdrawals) {

        int balance = account_Balance - withdrawals;
        System.out.print("your Remaining balance is >> $ " + balance);
    }
}
