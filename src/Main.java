import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner gas = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Gas per tank...");
        double gasoline = gas.nextDouble();

        Scanner mileage = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Mileage...");
        double mileage_amount = mileage.nextDouble();

        Scanner acos = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Average cost of Gas");
        double acos_amount = acos.nextDouble();

        Scanner distance = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Distance to Destination...");
        double distance_amount = distance.nextDouble();

        //create new variables
        double g = gasoline;
        double m = mileage_amount;
        double a = acos_amount;
        double d = distance_amount;

        //declare total variable
        double total = g * d / m * a;

        System.out.println("Username is: " + total);  // Output user input
    }
}
