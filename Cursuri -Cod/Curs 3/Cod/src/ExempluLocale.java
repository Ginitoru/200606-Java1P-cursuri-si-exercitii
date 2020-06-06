import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class ExempluLocale {

    public static void main(String[] args) {
        Locale l1 = new Locale("en", "UK");

        Locale l2 = new Locale.Builder()
                .setLanguage("ro")
                .setRegion("RO")
                .build();

        Locale l3 = Locale.CANADA_FRENCH;

        Locale l4 = Locale.getDefault();
        System.out.println(l4);

        ResourceBundle resourceBundle =
            ResourceBundle.getBundle("cuv", l2);

        System.out.println(resourceBundle.getString("bye"));
    }
}
