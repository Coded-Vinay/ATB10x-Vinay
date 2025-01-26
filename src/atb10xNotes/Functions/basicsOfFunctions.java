package atb10xNotes.Functions;

public class basicsOfFunctions {
    public static void main(String[] args) {
        // Calling the functions
        main();
        String S = hello();
        System.out.println(S);
        namegreet("Vinay");
        int s = sum(4, 5);
        System.out.println(s);

    }
    //TODO: User defined functions
  //  There are 4 type of user defined function

    //Step 1 declaring the function
    static void main() { // No argument and No parameter and no return because of void
        System.out.println("looklikemain");
    }

    static String hello() {  // No argument and  parameter but with return
        System.out.println("looklikemain");

        return "Hi are you ";
    }

    static void namegreet(String name) { // with argument and  parameter and no return because of void
        System.out.println(name);

    }

    static int sum(int a, int b) {// with argument and  parameter and with return
        return a + b;
    }
}

