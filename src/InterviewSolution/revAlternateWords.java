package InterviewSolution;


import java.util.Locale;

/*
TODO:  Problem statement: Given the input string "Today is sunny day",
 write a program to reverse the entire string and
 then reverse every alternate word in the reversed string.
 The output should be "yad sunny si today".
 */
public class revAlternateWords {
    public static void main (String[] Args) {
        String s = "Today is sunny day" ;
        String rev1 = new StringBuilder(s).reverse().toString();
        String[] spiltwords = rev1.split(" ");
        for(int i = 0 ; i< spiltwords.length ; i ++){
            if(i%2!=0){
                spiltwords[i] = new StringBuilder(spiltwords[i]).reverse().toString();

            }
            String Result = String.join(" ", spiltwords);
            System.out.println("INPUT: " + s);
            System.out.println("OUTPUT: " + Result);

        }


    }

}
