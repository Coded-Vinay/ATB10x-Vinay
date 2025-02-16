package atb10xTasks.OOPSConcepts.BookClassProblemStatement;


public class abstractProblemStatement{
    public static void main(String[] args) {

        String n = "Harry Potter";
        String a = " J K Rowling";
        int p = 120;

         BookClass bc = new PrintMyBook();
         bc.getdetails(n,a,p);
    }
}
