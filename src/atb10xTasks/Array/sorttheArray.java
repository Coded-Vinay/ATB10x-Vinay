package atb10xTasks.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sorttheArray {

    /*
    TODO: Sort the array  Input → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
     Output >> 1,3,4,10,12,32,34,100
     */
    public static void main(String[] args) {

        int[] number = {12, 34, 10, 1, 100, 3, 4, 32};


        for (int i = 0; i < number.length - 1; i++) {

            if (number[i] > number[i + 1]) {
                int k = number[i];
                number[i] = number[i + 1];
                number[i + 1] = k;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}

