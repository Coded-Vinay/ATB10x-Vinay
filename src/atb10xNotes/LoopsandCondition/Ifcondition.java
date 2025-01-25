package atb10xNotes.LoopsandCondition;

import java.util.Scanner;

public class Ifcondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


// Basic If else
        int a = 19;
        if (a == 10) {
            System.out.println("haha");
        } else {
            System.out.println("nana");
        }
//Basic If else for boolean

        System.out.println("Executing basic if else for boolean data type");
        Boolean b = !true;

        if(b){
            System.out.println("B is true");
        } else {
            System.out.println("B is false");
        }


    }
}
