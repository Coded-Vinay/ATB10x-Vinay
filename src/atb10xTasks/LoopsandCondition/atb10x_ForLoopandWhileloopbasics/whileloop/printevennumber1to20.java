package atb10xTasks.LoopsandCondition.atb10x_ForLoopandWhileloopbasics.whileloop;

public class printevennumber1to20 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;

        }
    }
}
