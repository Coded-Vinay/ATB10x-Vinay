package atb10xTasks.OOPSConcepts.BookClassProblemStatement;


abstract class BookClass {

    abstract void getdetails(String name, String author, int price);
}

class PrintMyBook extends BookClass {

    @Override
    void getdetails( String name, String author, int price) {
        System.out.print ( name + "  " + author + "   " + price);
    }
}
