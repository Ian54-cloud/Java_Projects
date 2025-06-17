public abstract class Vehicle implements Rentable{
    String modelName;
    String licensePlate;
    double basePricePerDay;
    public Vehicle(String modelName, String licensePlate, double basePricePerDay) {
        this.modelName = modelName;
        this.licensePlate = licensePlate;
        this.basePricePerDay = basePricePerDay;
    }
    public abstract void displayDetails();
}
