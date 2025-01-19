package atb10xNotes;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int a = 10;

        // Basic increments actions
        System.out.println(a); // No increment
        System.out.println(++a); // Pre- Increment
        System.out.println(a++); // Post Increment

        int b = a;
        System.out.println(b);


        // Increment and Arithmetic Operators
        // here a = 11
        int C = a++ + b;
        //here a = 12 (a++), b = 12 ( b=a)
        System.out.println(C);

        // Using Post and Pre Increment in same Line
        System.out.println( a++ + ++a); // here a++ = 12 , ++a 14

        // Using Two Pre increment operator
        System.out.println(++a + ++a);

    }
}
