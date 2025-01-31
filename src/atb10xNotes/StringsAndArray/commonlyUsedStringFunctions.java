package atb10xNotes.StringsAndArray;

public class commonlyUsedStringFunctions {
    public static void main(String[] args) {
        String s1 = "commonly Used String Functions";
        String s2 = "commonly USED String Functions";

        //length() - used to calculate length of the String
        int length = s1.length();
        System.out.println("String length is >> " + length);

        //toUppercase() - use to change all character of the string to upper case
        // Similarly this can be done for lowercase using toLowercase();
        System.out.println(s1.toUpperCase());

      //equals() and equalsIgnorecase() can be used to compare content of two strings
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("String are equal");
        }
        //substring() - used to take up the portionof the existing string using the starting and ending index

         s1.substring(0,9);
        System.out.println(s1.substring(0,9));

        //concat() -  used to join two string

        System.out.println(s1.concat(s2));

        // split() - Used to spilt  string into an array using delimiters

        String[] str = s1.split(" ");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);

        //chartAt() - Used to identify the character at the given index of the string
        System.out.println(s1.charAt(4));

        //trim() -  Trim the following and leading trails of space

        String withspace= "with space";
        System.out.println(withspace.trim());

        //indexof() - used to find the index of character in the string

        System.out.println(withspace.indexOf("w"));

        // contains() -  used to validate string conatins the given text or character
        System.out.println(withspace.contains("with"));

        //lastIndexof() -  in case where multiple characters are present this is used to determine the last index of the character
        System.out.println(withspace.lastIndexOf("s"));

        //replace() - used to replace the character with some thing else

        System.out.println(withspace.replace("s","t"));

        //Startwith() and endswith() -  validate if string start and end with certain character

        System.out.println(withspace.startsWith("with"));
        System.out.println(withspace.endsWith("space"));

    }
}
