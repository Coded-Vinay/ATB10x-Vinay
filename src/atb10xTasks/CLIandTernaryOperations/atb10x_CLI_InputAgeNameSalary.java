package atb10xTasks.CLIandTernaryOperations;

public class atb10x_CLI_InputAgeNameSalary {
    public static void main(String[] args) {

        /*
        TODO:
         Task - Take user Input  for Name Age and Salary and print at the end ||  Input using CLI
        */

        int age = Integer.parseInt(args[1]);
        System.out.printf("Name - %s Age - %d, Salary - %s", args[0],age,args[2] );
    }
}
