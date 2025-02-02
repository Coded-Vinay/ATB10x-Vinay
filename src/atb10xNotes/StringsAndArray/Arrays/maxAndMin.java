package atb10xNotes.StringsAndArray.Arrays;

public class maxAndMin {

    public static void main(String[] args) {

        int[] number = {34, 67, 89, 44, 67, 77, 12, 33, 45};
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println(max);

    for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println(min);
    }
}
