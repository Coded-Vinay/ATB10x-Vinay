package atb10xTasks.LoopsandCondition.ProblemStatement;


/*
 TODO: print 1 to 100
  :: for multiple of 3 print - Fizz
  :: for Multiple of 5 print - buzz
  :: for multiple of both print- Fizzbuzz
  >> Use for loop and If else statement
 */

public class atb10x_FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
