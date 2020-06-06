package Curs6.Creational.Factory;

import java.time.LocalDate;

public abstract class Car {

    private final String make;
    private final int maxSpeed ;
    private final LocalDate creationDate;

    public Car(String make, int maxSpeed, LocalDate creationDate) {
        this.make = make;
        this.maxSpeed = maxSpeed;
        this.creationDate = creationDate;
    }

    public String getMake() { return make; }
    public int getMaxSpeed() { return maxSpeed; }
    public LocalDate getCreationDate() { return creationDate; }

    abstract void sayType();
}
