package atb10xTasks;

public class atb10x_CLI_InputAgeNameSalary {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[1]);
        System.out.printf("Name - %s Age - %d, Salary - %s", args[0],age,args[2] );
    }
}
