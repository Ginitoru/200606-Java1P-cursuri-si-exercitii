package files;

import java.time.LocalDate;

public class Ticket {

    private User user;
    private LocalDate creationDate;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
