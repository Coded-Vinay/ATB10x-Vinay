package OOPSConceptPractice.Inheritance;

import java.util.Scanner;

public class VehicleBaseClass {

    int vehiclenumber, seatingcapacity;
    String Model;

    Scanner sc = new Scanner(System.in);
    int distance = 35;


    VehicleBaseClass() {
    }

    void assignvehicleno() {
        System.out.println("Enter vehicle number");
        vehiclenumber = sc.nextInt();
    }

    String assignmodel(String model) {
        System.out.println("select  vehicle from car/bike/auto");
        Model = sc.nextLine().toLowerCase();
        return Model;
    }

    void seatingcapacity() {
        System.out.println("Enter seats available");
        seatingcapacity = sc.nextInt();
    }


}
