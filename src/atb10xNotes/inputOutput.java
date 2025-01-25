package atb10xNotes;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

//TODO: Simple Print Output
        System.out.println("Simple String Text Output");

        /*
         Java command-line argument is an argument i.e. passed at the time of running the Java program.
         In Java, the command line arguments passed from the console can be received in the Java program
         and they can be used as input.
         */

//TODO: Input using CLI (Use Edit CLI argument  by using Edit Configuration  )
// Example:
        String age = args[0];
        String age2 = args[1];


        int n = Integer.parseInt(age2);
//TODO: The parseInt() method in Java is used to change numbers that are written as text (strings) into actual numbers (integers)


        System.out.println(n);
// TODO: Scanner class - The Scanner class is used to get user input, and it is found in the java.util package.

        /**
         * Method	Description
         * nextBoolean()	Reads a boolean value from the user
         * nextByte()	Reads a byte value from the user
         * nextDouble()	Reads a double value from the user
         * nextFloat()	Reads a float value from the user
         * nextInt()	Reads a int value from the user
         * nextLine()	Reads a String value from the user
         * nextLong()	Reads a long value from the user
         * nextShort()	Reads a short value from the user
         */
//TODO Example:
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);

    }
}
