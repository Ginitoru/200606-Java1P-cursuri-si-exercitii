package Curs6.Miscellaneous.LiskovsPrinciple.Right;


import java.util.ArrayList;
import java.util.List;

public class LiskovRight {
    public static void main(String[] args) {
        List<Pasare> pasari = new ArrayList<>();
        pasari.add(new Pasare());
        pasari.add(new Cioara());
        pasari.add(new Strut());
        lasaPasariSaZboare(pasari);
    }

    static void lasaPasariSaZboare(List<Pasare> pasari) {
        for(Pasare p : pasari) {
            p.mananca();
        }
    }
}








