public class Car extends Vehicle {
    public Car(String modelName, String licensePlate, double basePricePerDay) {
        super(modelName, licensePlate, basePricePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        double total = basePricePerDay * days;
        if (days > 7) {
            total *= 0.9;
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + modelName);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Base Price per Day: $" + basePricePerDay);
    }
}