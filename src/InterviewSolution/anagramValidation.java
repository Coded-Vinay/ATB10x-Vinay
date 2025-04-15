package InterviewSolution;


import java.lang.reflect.Array;
import java.util.Arrays;/*
TODO:Problem Statement: Write a program to validate two strings are anagram or not.
 An anagram is a word or phrase formed by rearranging the letters
 of another word or phrase.
 */
import java.util.Scanner;

public class anagramValidation {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first String: ");
        String s1 = sc.nextLine();
        System.out.println(" Enter first String: ");
        String s2 = sc.nextLine();
        if (Validation(s1, s2)) {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");
        }
    }

    public static Boolean Validation(String s1, String s2) {

        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            return false;

        }
        char[] CharS1 = s1.toCharArray();
        char[] CharS2 = s2.toCharArray();
        Arrays.sort(CharS1);
        Arrays.sort(CharS2);

        return Arrays.equals(CharS1, CharS2);


    }
}
