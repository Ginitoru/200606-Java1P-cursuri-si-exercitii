package Curs6.Creational.Factory;

import java.time.LocalDate;

public class TestFactory {

    public static void main(String[] args) {
        Car car = CarFactory.getCar(CarType.PETROL, "Tesla", 250, LocalDate.now());
        car.sayType();
    }
}
