package atb10xTasks.LoopsandCondition.forLoop;

public class EvenOdd5050 {
    public static void main(String[] args) {

        /*
        TODO:
         Program to Print number along with the category from odd and even
         Use For loop along with if statement
         */

        for (int i = 0; i <= 50; i++) {
            /*
             for Loop with if and Continue
             */

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
                continue;
            }
                System.out.println(i + " Is ODD");
        }
    }
}
