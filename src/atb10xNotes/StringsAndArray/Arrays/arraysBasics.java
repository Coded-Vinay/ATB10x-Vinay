package atb10xNotes.StringsAndArray.Arrays;

import java.util.Scanner;

public class arraysBasics {

    public static void main(String[] args) {

        int [] array = { 1,2,3,4,5,6}; // Initializing an array
        System.out.println(array[4]); // getting item in array using index

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];

        for(int i=0; i<size; i++){
            names[i] = sc.nextLine();
        }

        System.out.println("________________________");
        for(String name : names) {
            System.out.println(name);
        }
    }
}
