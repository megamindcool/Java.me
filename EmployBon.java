
//Victor Mwangi 
//CT101/G/19127/123
//hello world
   public class EmployBon {
    public static void main(String[] args) {
        // Hardcoded values for salary and years of service
        double sal = 50000; // Example salary
        int yrs = 8;        // Example years of service

        // Variable for bonus percentage
        double bonusPerc;

        // Determine the bonus percentage based on years of service
        if (yrs > 10) {
            bonusPerc = 12.0;
        } else if (yrs >= 6) {
            bonusPerc = 10.0;
        } else {
            bonusPerc = 8.0;
        }

        // Calculate bonus amount
        double EmployBon = (bonusPerc / 100) * sal;

        // Print the bonus amount
        System.out.println("Salary: $" + sal);
        System.out.println("Years of Service: " + yrs);
        System.out.println("Net Bonus: $" + EmployBon);
    }
}

