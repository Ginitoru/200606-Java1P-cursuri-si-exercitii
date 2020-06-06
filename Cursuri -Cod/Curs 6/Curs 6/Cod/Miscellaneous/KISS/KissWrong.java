package Curs6.Miscellaneous.KISS;

public class KissWrong {

    public static void main(String[] args) {
        System.out.println(howMuchToPay("RO", "Moldova", 100, 15, 150));
    }

    private static double howMuchToPay(String region, String country, double amount, double tax, double price) {
        if (country.equals("RO")) {
            if (region.equals("Moldova") || region.equals("Muntenia")) {
                if (amount > 15) {
                    price -= (0.15* price);
                    price += ((tax / 100) * price);
                    return price * amount;
                }
                return ((price + ((tax / 100) * price)) * amount);
            } else {
                return ((price + ((tax / 100) * price)) * amount);
            }
        } else {
            return price * amount;
        }
    }
}
