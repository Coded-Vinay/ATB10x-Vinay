package OOPSConceptPractice.Inheritance;


import java.util.Scanner;

/*
TODO: Create a base class Vehicle with attributes like vehicle number, model, and seating capacity.
  Derive subclasses like Car, Bike, and Auto, each with unique properties and behavior.
 Implement a method to calculate the ride fare based on distance traveled and vehicle type
 */
public class RideSharingSystem {
    public static void main(String[] args) {

        VehicleBaseClass v1 = new VehicleBaseClass();
        System.out.println("Configure vehicle");
        v1.assignvehicleno();
        v1.seatingcapacity();
        Scanner sc = new Scanner(System.in);
        int totalfare;
        String model = "";

        if (model.equals("auto")) {
            Auto a1 = new Auto();
            totalfare = a1.farecalc();
        } else if (model.equals("bike")) {
            Bike a1 = new Bike();
            totalfare = a1.farecalc();
        } else {
            Car a1 = new Car();
            totalfare = a1.farecalc();
        }
        System.out.println("Total fare is >> "+totalfare);
        }
    }
