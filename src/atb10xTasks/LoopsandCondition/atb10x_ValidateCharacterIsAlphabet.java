package atb10xTasks.LoopsandCondition;

import java.util.Scanner;

public class atb10x_ValidateCharacterIsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character >> ");
        char c = sc.next().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

            System.out.println("You have entered an alphabet");
        } else {
            System.out.println(" You have not entered an alphabet");
        }


    }
}
