package modules;

public class TruckClass implements Vehicle{
    private String brand;
    private String motor;
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


    public int getWheels() {
        return numberOfWheels;
    }

    public void setWheels(int newNumberOfWheels) {
        this.numberOfWheels = newNumberOfWheels;
    }

    public String toString() {
        return "\nTRUCK | Brand: " + brand + " | Motor: " + motor + " |  Number of wheels: " + numberOfWheels;
    }
}
