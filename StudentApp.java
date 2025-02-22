//VICTOR MWANGI KIBOI
//CT101/G/19127/23

import java.util.Scanner;

// A simple class to hold student details
class StudentRecord {
    private String studentID;
    private String name;
    private String course;

    // Constructor to set up the student details when creating a new object
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID.trim();
        this.name = name.trim();
        this.course = course.trim();
    }

    // Method to print out the student's details
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Main class that handles user input and displays student information
public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter student details
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine().trim();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine().trim();

        // Simple check to make sure the user entered something in each field
        if (studentID.isEmpty() || name.isEmpty() || course.isEmpty()) {
            System.out.println("\nError: Please fill in all fields!");
        } else {
            // Create a new StudentRecord object with the given details
            StudentRecord student = new StudentRecord(studentID, name, course);

            // Show the entered details
            student.displayInfo();
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
