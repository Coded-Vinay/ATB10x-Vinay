package atb10xTasks.LoopsandCondition.atb10x_ForLoopandWhileloopbasics.whileloop;

public class sum10naturalnumber {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
