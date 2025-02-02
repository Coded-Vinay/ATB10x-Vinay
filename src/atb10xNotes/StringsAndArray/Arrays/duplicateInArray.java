package atb10xNotes.StringsAndArray.Arrays;

public class duplicateInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 34, 56, 34, 55, 55, 67, 99};
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && j != i) {
                    if (numbers[i] != k) {
                        k = numbers[i];
                        System.out.println(k + " is duplicate");
                    }

                }
            }

        }
    }
}
