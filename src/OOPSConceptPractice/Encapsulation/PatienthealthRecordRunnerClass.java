package OOPSConceptPractice.Encapsulation;

public class PatienthealthRecordRunnerClass {

    public static void main(String[] args) {
        String name="";
        String MH = "";
        int age = 0;
        patient p2 =new patient(name, MH,age);
        p2.setName("Ram",true);
        p2.setAge(34);
        p2.setMedicalHistory("Available");

        p2.getAge();
        p2.getName();
        p2.getMedicalHistory();


    }
}
