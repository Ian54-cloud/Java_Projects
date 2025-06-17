import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle car = new Car("Mercedes AMG ", "CAR3729", 50.0);
        Vehicle bike = new Bike("KTM", "BIKE082", 20.0);
        try {
            System.out.println("Choose a vehicle to rent (car/bike): ");
            String choice = scanner.nextLine().toLowerCase();

            Vehicle selectedVehicle;

            if (choice.equals("car")) {
                selectedVehicle = car;
            } else if (choice.equals("bike")) {
                selectedVehicle = bike;
            } else {
                throw new IllegalArgumentException("Invalid vehicle choice.");
            }

            System.out.println("Enter number of rental days: ");
            int days = scanner.nextInt();

            if (days <= 0) {
                throw new IllegalArgumentException("Rental days must be greater than zero.");
            }
            System.out.println(" Rental Details");
            selectedVehicle.displayDetails();
            double cost = selectedVehicle.calculateRentalCost(days);
            System.out.println("Rental Duration: " + days + " days");
            System.out.println("Total Rental Cost: $" + cost);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
        }

