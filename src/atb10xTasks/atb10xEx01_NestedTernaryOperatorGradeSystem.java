package atb10xTasks;

public class atb10xEx01_NestedTernaryOperatorGradeSystem {
    public static void main(String[] args) {
        int marks = 90;
/*
        TODO:
          Basic Ternary Operator Syntax --> result =  Condition1 ? Expression1 : Expression2
          Nested Ternary Operator Syntax --> result =  Condition1 ? Expression1 : ( Condition 2 ? Expression2 : Expression3)
         */

        String Result = marks >= 90 ? "A" : (marks >= 80 ? "B" : (marks >= 70 ? "C" : (marks >= 60) ? "D" : "F"));
        System.out.println(Result);
    }
}