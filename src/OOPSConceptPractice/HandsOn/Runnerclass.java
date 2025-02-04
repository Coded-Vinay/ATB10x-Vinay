package OOPSConceptPractice.HandsOn;

public class Runnerclass {
    public static void main(String[] args) {

        testcase1 tc1 = new testcase1();
        tc1.startTC1();
        tc1.setBrowser("Chrome", false);// Dynamic Dispatch >> parent class and child object
        tc1.getBrowser();

    }
}
