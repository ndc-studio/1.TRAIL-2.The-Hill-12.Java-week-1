package modules;

public class CarClass implements Vehicle {
    private String brand;
    private String motor;
    private int numberOfDoors;
    private int numberOfWheels;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    
    public String getMotor() {
        return motor;
    }

    public void setMotor(String newMotor) {
        this.motor = newMotor;
    }

    public int getDoors() {
        return numberOfDoors;
    }

    public void setDoors(int newNumberOfDoors) {
        this.numberOfDoors = newNumberOfDoors;
    }

    public int getWheels() {
        return numberOfWheels;
    }

    public void setWheels(int newNumberOfWheels) {
        this.numberOfWheels = newNumberOfWheels;
    }

    public String toString() {
        return "\nTRUCK |  Brand: " + brand + " |  Motor: " + motor + " |  Number of doors: " + numberOfDoors + " |  Number of wheels: " + numberOfWheels;
    }
}
