package atb10xNotes.StringsAndArray.Arrays;

import java.util.Scanner;

public class findMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}
