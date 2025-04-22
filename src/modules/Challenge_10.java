package modules;

import java.util.ArrayList;
import java.util.List;

public class Challenge_10 {
    public static void challenge_10() {
        TruckClass mercedesTruck = new TruckClass();
        mercedesTruck.setBrand("Mercedes");
        mercedesTruck.setMotor("4500cc Diesel");
        mercedesTruck.setWheels(6);

        TruckClass scaniaTruck = new TruckClass();
        scaniaTruck.setBrand("Scania");
        scaniaTruck.setMotor("5200cc Diesel");
        scaniaTruck.setWheels(8);

        TruckClass volvoTruck = new TruckClass();
        volvoTruck.setBrand("Volvo");
        volvoTruck.setMotor("4000cc Diesel");
        volvoTruck.setWheels(10);

        TruckClass manTruck = new TruckClass();
        manTruck.setBrand("MAN");
        manTruck.setMotor("6000cc Diesel");
        manTruck.setWheels(12);

        CarClass toyotaCar = new CarClass();
        toyotaCar.setBrand("Toyota");
        toyotaCar.setMotor("1800cc Essence");
        toyotaCar.setDoors(3);
        toyotaCar.setWheels(3);

        CarClass teslaCar = new CarClass();
        teslaCar.setBrand("Tesla");
        teslaCar.setMotor("Electric");
        teslaCar.setDoors(5);
        teslaCar.setWheels(4);

        CarClass bmwCar = new CarClass();
        bmwCar.setBrand("BMW");
        bmwCar.setMotor("2400cc Diesel");
        bmwCar.setDoors(5);
        bmwCar.setWheels(4);

        CarClass fordCar = new CarClass();
        fordCar.setBrand("Ford");
        fordCar.setMotor("1600cc Essence");
        fordCar.setDoors(3);
        fordCar.setWheels(4);

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(mercedesTruck);
        vehicleList.add(scaniaTruck);
        vehicleList.add(volvoTruck);
        vehicleList.add(manTruck);
        vehicleList.add(toyotaCar);
        vehicleList.add(teslaCar);
        vehicleList.add(bmwCar);
        vehicleList.add(fordCar);

        System.out.println(vehicleList);

    }
    
}
