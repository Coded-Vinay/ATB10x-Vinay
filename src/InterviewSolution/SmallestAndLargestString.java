package InterviewSolution;

import java.util.Arrays;

public class SmallestAndLargestString {

    public static void main(String[] args) {

        String input = "vision without action is day Dream";

        String[] inputarr = input.split(" ");


        for (int i = 0; i <= inputarr.length - 2; i++) {
            int a = inputarr[i].length();
            int b = inputarr[i + 1].length();

            if (a > b) {
                String k = inputarr[i];
                inputarr[i] = inputarr[i + 1];
                inputarr[i + 1] = k;

                i = -1;
            }
        }
        System.out.println(Arrays.toString(inputarr));

        System.out.println("Smallest String is " + inputarr[0]);
        System.out.println("Largest String is " + inputarr[inputarr.length - 1]);

    }
}
