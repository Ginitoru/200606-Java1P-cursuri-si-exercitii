package view;

import models.Angajat;
import models.Departament;

import javax.swing.*;
import java.awt.*;

public class AngajatiFrame extends JFrame {

    private JLabel backGroundLabel;
    private JPanel backgroundPanel;

    private JButton adaugaButton;
    private JTextField numeFiled, varstaFiled;
    private DefaultListModel<Angajat> model;
    private Departament departament;
    private JList<Angajat> lista1;

    public AngajatiFrame(Departament departament){



        initComponents();
        adaugaPanouBackground();
        adaugaButton();
        adaugaTexfielduri();
        setVisible(true);

        this.departament = departament;

        model = new DefaultListModel<>();
        lista1 = new JList<>();
        lista1.setBounds(20,20,500,500);
        lista1.setModel(model);
        backgroundPanel.add(lista1);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private void initComponents(){
        setSize(600,800);
        setLocationRelativeTo(null);

    }

    private void adaugaPanouBackground(){
        backgroundPanel = new JPanel();
        backgroundPanel.setLayout(null);
        backgroundPanel.setBackground(Color.CYAN);
        add(backgroundPanel);
    }

    private void adaugaButton(){
        adaugaButton = new JButton("Adauga");
        adaugaButton.setBounds(20,700,500,20);
        backgroundPanel.add(adaugaButton);
    }

    private void adaugaTexfielduri(){
        numeFiled = new JTextField();
        varstaFiled = new JTextField();

        numeFiled.setBounds(20,600,500,20);
        varstaFiled.setBounds(20,650,500,20);



        backgroundPanel.add(numeFiled);
        backgroundPanel.add(varstaFiled);


    }

    private void refresh(){
        model.clear();

   //  List<Angajat> angajati  = MainController.getInstance().getAnagajati(departament.getId());

    }





}
