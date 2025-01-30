package atb10xTasks.LoopsandCondition.ifElse;

import java.util.Scanner;

public class smallestOfThree {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int a = Sc.nextInt();

        System.out.println("Enter the first number ");
        int b = Sc.nextInt();

        System.out.println("Enter the first number ");
        int c = Sc.nextInt();

        largestOfThreeusingIfElse  n = new largestOfThreeusingIfElse();

        n.smallestOfThree(a, b, c);

    }
}
