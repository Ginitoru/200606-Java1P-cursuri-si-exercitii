package BileteTrenGUI.pages;

import javax.swing.*;
import java.awt.*;

public class DashboardPage extends JFrame {

    JLabel labelSursa = new JLabel("Statie Plecare");
    JLabel labelDestinatie = new JLabel("Statie Sosire");

    public DashboardPage() {
        setTitle("Aplicatie de vanzare a biletelor de tren");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);


        LayoutManager layoutManager = new GridLayout();


    }
}
