package modules;

public class TruckClass {
    private String brand;
    private String motor;
    private int numberOfWheels;

    public int getWheels() {
        return numberOfWheels;
    }

    public int setWheels(int newNumberOfWheels) {
        this.numberOfWheels = newNumberOfWheels;
    }
}
