package InterviewSolution;


// TODO: find all the leader elements in the array.
/* Leader elements are those elements that are greater than all
the elements to their right in the array */

import java.util.ArrayList;
import java.util.List;

public class leadersInArray {
    public static void main(String[] Arg) {
        int[] arr = {5, 10, 9, 17, 15};
        List<Integer> leader = findleader(arr);
        System.out.println(" leader elements :: " + leader);
    }
public static List<Integer> findleader(int[] arr){

        List<Integer> leader = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1 ; i >= 0 ; i--){
        if(arr[i]>max ) {
            max = arr[i];
            leader.addFirst(arr[i]);

        }
        }
        return leader;

    }}

