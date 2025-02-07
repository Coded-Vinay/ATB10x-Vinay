package atb10xTasks.LoopsandCondition.ProblemStatement;

import java.util.Scanner;


public class atb10x_ArmstrongNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number >> ");
        int Number = sc.nextInt();

        int og , n = 0 , result = 0, rem;
        og = Number;

        for(;og!=0; og/=10){
            n++; // calcualting number of digits
        }

      //  og=Number;

        for(;og!= 0 ; og/=10){
            rem = og%10;
            result += Math.pow(rem,n);
        }

        if(result == Number){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Not armstrong");
        }


}}
