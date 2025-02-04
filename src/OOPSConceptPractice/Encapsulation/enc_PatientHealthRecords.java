package OOPSConceptPractice.Encapsulation;



/*
TODO: Design a Patient class that stores patient details such as name, age, and medical history.
 Ensure medical history is private and can only be modified through specific methods.
 Implement methods to add new medical records and retrieve existing records securely.
/*
Encapsulation is one of the four pillars of OOP (Encapsulation, Inheritance, Polymorphism, Abstraction).
It improves security, data integrity, and code maintainability by
controlling how data is accessed and modified.
*/

import java.util.Scanner;

public class enc_PatientHealthRecords {

    public static void main(String[] args) {
        patient p1= new patient("Ram", "Nohistory", 32);
        Scanner sc = new Scanner(System.in);
        p1.getAge();
        System.out.println("Enter the name");
        p1.setName(sc.nextLine(),true);
        p1.getName();
        p1.setName(sc.nextLine(),false);
    }

}


class patient {

    //Private Variable
    private String name;
    private String MedicalHistory;
    private int age;

    //Parameterized Constructor
    patient(String name, String MedicalHistory, int age){
        this.age = age;
        this.name = name;
        this.MedicalHistory = MedicalHistory;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name, boolean isauth) {
        if(isauth==true){
            this.name = name;
        }else{
        System.out.println("Not Allowed");
    }}

    public String getMedicalHistory() {
        return MedicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        MedicalHistory = medicalHistory;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}