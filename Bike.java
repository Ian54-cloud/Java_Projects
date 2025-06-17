public class Bike extends Vehicle{
    public Bike(String modelName, String licensePlate, double basePricePerDay) {
        super(modelName, licensePlate, basePricePerDay);
    }
    @Override
    public double calculateRentalCost(int days) {
        double total = basePricePerDay * days;
        if (days > 5) {
            total *= 0.95; // 5% discount
        }
        return total;
    }
    @Override
    public void displayDetails() {
        System.out.println("Bike Model: " + modelName);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Base Price per Day: $" + basePricePerDay);
    }
}
