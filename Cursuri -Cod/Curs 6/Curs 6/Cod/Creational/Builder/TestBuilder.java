package Curs6.Creational.Builder;

import java.time.LocalDate;

public class TestBuilder {


    public static void main(String[] args) {
        Om om = new Om.OmBuilder("Andrei", "Popescu", "1701122343221", LocalDate.of(1970, 11, 22))
                .withInaltime(182)
                .withGreutate(70)
                .withNationalitate("Roman")
                .build();
    }
}
