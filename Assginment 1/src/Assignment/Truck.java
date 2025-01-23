package Assignment;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year); // Call the constructor of the superclass
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getDescription() {
        return "Truck: " + getMake() + " " + getModel() + " (" + getYear() + "), Payload Capacity: " + payloadCapacity + " tons";
    }
}