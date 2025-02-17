package atb10xTasks.Array;

import java.util.Arrays;

public class secondSmallestinArray {

    public static void main(String[] args) {

        int[] n = {12, 34, 10, 1, 100, 3, 4, 32};

        for(int i=0; i<n.length-1 ; i++){
            if (n[i]>n[i+1]){

                int t = n[i];
                n[i]=n[i+1];
                n[i+1]= t;

                i =-1;
            }


        }
        System.out.println(Arrays.toString(n));
        System.out.println("Second smallest number is " + n[1]);
    }
}
