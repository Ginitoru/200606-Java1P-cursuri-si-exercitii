package Curs6.Creational.Factory;

import java.time.LocalDate;

public class ElectricCar extends Car {

    public ElectricCar(String make, int maxSpeed, LocalDate creationDate) {
        super(make, maxSpeed, creationDate);
    }

    @Override
    void sayType() {
        System.out.println("I am an electric car!");
    }
}
