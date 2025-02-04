package OOPSConceptPractice.Inheritance;


class Car extends VehicleBaseClass {
    int fareperkm = 25;

    int farecalc() {

        seatingcapacity();

        int totalfare = distance * fareperkm * seatingcapacity;
        return totalfare;
    }
}

class Bike extends VehicleBaseClass {
    int fareperkm = 15;

    int farecalc() {

        seatingcapacity();

        int totalfare = distance * fareperkm * seatingcapacity;
        return totalfare;
    }
}

class Auto extends VehicleBaseClass {

    int fareperkm = 5;

    int farecalc() {
        seatingcapacity();
        int totalfare = distance * fareperkm * seatingcapacity; // Seatingcapacity and distance is inherited from  vehiclebaseclass
        return totalfare;
    }
}


