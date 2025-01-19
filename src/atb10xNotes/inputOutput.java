package atb10xNotes;

public class inputOutput {
    public static void main(String[] args) {
        // Simple Print Output
        System.out.println("Simple String Text Output");

        // Input using CLI (Use Edit CLI argument  by using Edit Configuration  )
        String age = args[0];

        int age_no = Integer.parseInt(age);
        // The parseInt() method in Java is used to change numbers that are written as text (strings) into actual numbers (integers)

        System.out.println(age_no);

    }
}
