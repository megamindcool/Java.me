//Victor Mwangi Kiboi
//CT101/G/19127/23
import java.util.Scanner;

// Vehicle class, the base for all vehicles.
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor to set vehicle details.
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to show vehicle details.
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Car class, extending Vehicle.
class Car extends Vehicle {
    String fuelType;

    // Constructor for car details, including fuel type.
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call parent class constructor
        this.fuelType = fuelType;
    }

    // Overriding displayDetails to add fuel type.
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent method to display basic details
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom class for user input and car details.
class Showroom {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for vehicle details.
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine().trim();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine().trim();

        int year = 0;
        while (true) { // Loop until a valid integer is entered
            System.out.print("Enter Year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next(); // Consume invalid input
            }
        }

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine().trim();

        // Create Car object from user input.
        Car car = new Car(brand, model, year, fuelType);

        // Show the car details.
        System.out.println("\nCar Details:");
        car.displayDetails();

        scanner.close();
    }
}
