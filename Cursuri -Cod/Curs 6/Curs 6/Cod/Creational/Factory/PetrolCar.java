package Curs6.Creational.Factory;

import java.time.LocalDate;

public class PetrolCar extends Car {

    public PetrolCar(String make, int maxSpeed, LocalDate creationDate) {
        super(make, maxSpeed, creationDate);
    }

    @Override
    void sayType() {
        System.out.println("I am a petrol car!");
    }
}
