package Curs6.Miscellaneous.KISS;

import java.util.Set;

class Country {
    String code;
    double discountAmountPercent;
    double taxAmountPercent;
    Set<String> discountRegions;

    public Country(String code, int discountAmountPercent, int taxAmountPercent, Set<String> discountRegions) {
        this.code = code;
        this.discountAmountPercent = discountAmountPercent;
        this.taxAmountPercent = taxAmountPercent;
        this.discountRegions = discountRegions;
    }
}

class Romania extends Country {
    Romania() {
        super("RO", 15, 23, Set.of("Moldova", "Muntenia"));
    }
}



class Payment {
    static double calculateTax(double price, double tax) {
        return price + tax / 100 * price;
    }

    static double calculateDiscount(double price, double discount) {
        return price - discount / 100 * price;
    }

    static double amountToPay(Country country, String region, double amount, double price) {
        if (country.discountRegions.contains(region) && amount > 15) {
            price = calculateDiscount(price, country.discountAmountPercent);
        }
        return amount * calculateTax(price, country.taxAmountPercent);

    }
}


public class KissRight {
    public static void main(String[] args) {
        System.out.println(Payment.amountToPay(new Romania(), "Moldova", 25, 1000));
    }
}
