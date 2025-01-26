package atb10xTasks.Functions;
import java.util.Scanner;



public class atb10x_MathsFunction {

    /*
    TODO: Program to perform mathematical operations on two number
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int s = add(a, b);
        int su = Sub(a, b);
        int m = mul(a, b);
        float d = div(a, b);

        System.out.println("Sum of given number is" + s);
        System.out.println("Difference in two number is " + su);
        System.out.println("Product of two number is " + m);
        System.out.println("Dividing two number will give " +d);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int Sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}
