package atb10xNotes.StringsAndArray.Arrays;

import java.util.Arrays;

public class reverseArraywithoutusingextraSpace {
    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = n.length - 1;
        int k = 0;

        for (int i = 0; i < l; i++) {
            k = n[i];
            n[i] = n[l];
            n[l] = k;
            l--;
        }
        System.out.println(Arrays.toString(n));

    }

    }

