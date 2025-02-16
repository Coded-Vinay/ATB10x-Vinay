package atb10xNotes.OOPs;

public class StaticKeyword {
    public static void main(String[] args) {

        atb a1 = new atb("Rama");
        atb a2 = new atb("shyama");
        atb a3 = new atb("drama");

        a1.readdocument();
        a2.setName("Setname");

        atb.doassignment();
        System.out.println(atb.course);
    }
}

class atb {

    //IIB will be executed everytime the object is created for the class
    {
        System.out.println("IIB");
    }


    // Static block will load once when class is called.
  static   {
      System.out.println("SIB");

    }


    //Encapsulation

    private String name ;
    private String phone;

    static String course =" intercourse";

    public atb(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void readdocument(){
        System.out.println("non static function re  ad document");
        System.out.println();
    }

    static void  doassignment(){
        System.out.println("Do assignment Static Function");
    }
}