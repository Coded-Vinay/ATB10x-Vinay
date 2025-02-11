package InterviewSolution;

import java.util.Arrays;


/*
TODO: - [ ] Write a simple java program ( Allowed to use IntelliJ )
  Rotate an array of integers 3 time and after each rotation last item should come at first place
  and all the other items should shift to next place ”
  Input : { 1,2,3,4,5,6,7} Output : {7,1,2,3,4,5,6} , {6,7,1,2,3,4,5}, {5,6,7,1,2,3,4}
 */



public class CageminiL1BasicJavaQuestion {
        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 6, 7};

            for (int j = 1; j <= 3; j++) {

                int k = arr[6];
                for (int i = (arr.length - 1); i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = k;
                System.out.println(Arrays.toString(arr));
            }
        }
    }


