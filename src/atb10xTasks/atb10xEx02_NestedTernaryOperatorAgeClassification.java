package atb10xTasks;

public class atb10xEx02_NestedTernaryOperatorAgeClassification {
    public static void main(String[] args) {
        int age = 25;

        // Classify Age in category of Adult. Minor and Senior
        // Nested Ternary Operation

        String Category = age < 18 ? "Minor" : (age < 65 ? "Adult" : "Senior");
        System.out.println("Age falls under " + Category + " Category");
    }
}
