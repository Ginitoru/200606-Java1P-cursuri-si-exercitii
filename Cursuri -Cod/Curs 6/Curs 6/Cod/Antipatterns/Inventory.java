package Curs6.Antipatterns;

import java.util.List;
import java.util.ArrayList;

public class Inventory {
    //Fields (we only have one)
    List<Supply> supplies = new ArrayList<>();

    //Methods
    int countContaminatedSupplies() {
        //TODO: check if field is already initialized (not null)

        int contaminatedCounter = 0; //the counter
        //No supplies => No contaminations
        for(Supply supply : supplies) { //begin for
            if(supply.isContaminated()) {
                contaminatedCounter++; //increment counter!
            } //end if supply is contaminated
        } //end for

        //returns the number of contaminated supplies
        return contaminatedCounter;
    }
} //end of Inventory class
