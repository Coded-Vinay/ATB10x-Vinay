package atb10xTasks;

public class atb10xEx03_NestedTernaryOperatorMaxOfThree {
    public static void main(String[] args) {
        // Find Largest Number out of given 3
        int n1 = 34, n2 = 56, n3 = 78;

        int Goat = n1 >= n2 ? (n1 >= n3 ? n1 : n3) : (n2 >= n3 ? n2 : n3);
        System.out.println("Greates of three number is   " + Goat);
    }
}
