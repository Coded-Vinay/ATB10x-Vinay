package OOPSConceptPractice.HandsOn;

public class Baseclass {

    String browser; //unshared instance variable

    // default constructer
    Baseclass() {
        System.out.println("Baseclass executed");
        this.browser = browser;
    }

    //getter setter to access private variable
    public String getBrowser() {
        System.out.println(browser);
        return browser;
    }

    public void setBrowser(String browser, boolean auth) {
        System.out.println("running base class set browser");
        if(auth){
            this.browser = browser;
        } else {
            System.out.println("Not allowed");
        }
    }

    //Additional function in base class

    void openbrowser() {
        System.out.println("Open browser");
    }
    //Polymorphism
    void openbrowser(String  browser) {
        System.out.println("Open browser");
    }

    void closebrowser(){
        System.out.println("Closed browser");
    }
}
