package atb10xNotes.StringsAndArray.Arrays;

import java.util.Arrays;

public class moveZerosatTheEnd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 0, 0, 6, 0, 7, 8, 0};

        int j = 0; // Position to place the next non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
