package atb10xNotes.OOPs;

// Class declaration: Defines a class named Car
class Car {
    String model; // Instance variable to store the model of the car

    // Constructor: Initializes the Car object with a given model
    Car(String model) {
        this.model = model; // `this.model` refers to the instance variable, avoiding ambiguity
    }

    // Method to display the car model
    void display() {
        System.out.println("Car Model: " + model); // Prints the model of the car
    }
}


// Main class containing the main() method to run the program
public class ClassObjectConstructor {
    public static void main(String[] args) { // Entry point of the Java program
        Car myCar = new Car("Tesla"); // Creating an object of Car and initializing it with "Tesla"
        myCar.display(); // Calling the display() method to print the car model
    }
}
