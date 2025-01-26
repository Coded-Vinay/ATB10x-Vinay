package atb10xTasks.LoopsandCondition;

import java.util.Scanner;

public class fibonnaciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting number");
        int start = sc.nextInt();
        System.out.println("Enter the range");
        int range = sc.nextInt();
        fibonaaci(start, range);

    }

    static void fibonaaci(int a, int r) { // a is first term and r is the range
        int b = a + (a-1); // b is the next term
        int c;

        for (int i = 1; i <=r; ++i) {
            System.out.print(a + " , ");
            c = a + b;
            a = b;
            b = c;


        }
    }
}
