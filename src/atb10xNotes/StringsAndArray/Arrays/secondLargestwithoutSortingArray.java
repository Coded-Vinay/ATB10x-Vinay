package atb10xNotes.StringsAndArray.Arrays;

public class secondLargestwithoutSortingArray {
    public static void main(String[] args) {

        int[] number = {33,56,78,99,23,45,66,76};
        int max = number[1];
        int max2 = number[2];
        for(int i =0; i<number.length; i++){
            for (int j = 0; j<number.length; j++){
                if(number[i] > max){
                    max=number[i];
                    if (max2>max){
                        max2=max;
                    }
                }
            }
        } System.out.println(max2);
    }
}
