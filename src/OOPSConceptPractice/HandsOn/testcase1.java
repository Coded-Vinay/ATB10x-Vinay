package OOPSConceptPractice.HandsOn;

public class testcase1 extends Baseclass {


    public testcase1() {
        super(); // calling parent constructor
        System.out.println("TC1 executed");
    }

    public void startTC1() {
        openbrowser();
        closebrowser();
    }


    @Override // Overriding the setbrowser which is also present in baseclass
    public void setBrowser(String browser, boolean auth) {
        System.out.println("running child set browser");
        if (auth) {
            System.out.println("Not allowed");

        } else {
            this.browser = browser;

        }
    }
}
