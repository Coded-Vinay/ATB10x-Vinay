package atb10xTasks.LoopsandCondition.ifElse;


import java.util.Scanner;

public class atb10x_Divisibilityby5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n%5==0 && n%11==0){
            System.out.println("Numberis divisible by 5 and 11");
        }else if (n%5==0 && n%11!=0){
            System.out.println(" Number is  divisible by 5 but not by 11");
        }else if (n%5!=0 && n%11==0){
            System.out.println(" Number is  divisible by 11 but not by 5");
        }else {
            System.out.println("Number is neither divisible by 5 or 11");
        }
    }

}
