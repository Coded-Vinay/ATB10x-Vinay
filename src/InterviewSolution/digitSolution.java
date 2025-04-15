package InterviewSolution;

import java.util.ArrayList;

/*
TODO:  Problem Statement:
  Write a Program to find the smallest value in 2 digit from integer 1 to 100 whose sum is 16.
 */
public class digitSolution {
    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            int sum = i / 10;
            sum = sum + i % 10;
            if (sum == 16) {
                System.out.println(i);
                break;
            }

        }
    }
}
