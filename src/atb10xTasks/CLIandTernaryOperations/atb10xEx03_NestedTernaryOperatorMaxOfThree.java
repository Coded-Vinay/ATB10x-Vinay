package atb10xTasks.CLIandTernaryOperations;

public class atb10xEx03_NestedTernaryOperatorMaxOfThree {
    public static void main(String[] args) {

/*
        TODO:
         Find max of the given three numbers
          Nested Ternary Operator Syntax --> result =  Condition1 ? Expression1 : ( Condition 2 ? Expression2 : Expression3)
*/
        int n1 = 34, n2 = 56, n3 = 78;

        int Goat = n1 >= n2 ? (n1 >= n3 ? n1 : n3) : (n2 >= n3 ? n2 : n3);
        System.out.println("Greatest of three number is   " + Goat);
    }
}
