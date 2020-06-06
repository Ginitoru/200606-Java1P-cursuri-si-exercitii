package Curs6.Creational.Factory;

import java.time.LocalDate;

public class CarFactory {

    public static Car getCar(CarType carType, String make, int maxSpeed, LocalDate creationDate) {
        switch (carType) {
            case ELECTRIC:
                return new ElectricCar(make, maxSpeed, creationDate);
            case PETROL:
                return new PetrolCar(make, maxSpeed, creationDate);
            default:
                throw new RuntimeException("Car Type not available!");
        }
    }
}
