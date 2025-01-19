package atb10xNotes;

public class inputOutput {
    public static void main(String[] args) {
        // Simple Print Output
        System.out.println("Simple String Text Output");

        // Input using CLI (Use Edit CLI argument  by using Edit Configuration  )
        String age = args[0];
        String age2 = args[1];


        int n = Integer.parseInt(age2);
        // The parseInt() method in Java is used to change numbers that are written as text (strings) into actual numbers (integers)

        System.out.println(n);

    }
}
