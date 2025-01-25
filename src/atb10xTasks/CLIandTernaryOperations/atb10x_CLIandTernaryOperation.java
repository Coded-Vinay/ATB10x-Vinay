package atb10xTasks.CLIandTernaryOperations;

public class atb10x_CLIandTernaryOperation {
    public static void main(String[] args) {
    /*
        TODO:
         Take Two number and determine maximum using ternary operation.
         Input using CLI >> Numbers are 69 and 96
         */

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        String Maximum = n1 > n2 ? n1+ " Is Maximum value" : n2 + " is Maximum value" ;
        System.out.println(Maximum);
    }
}
