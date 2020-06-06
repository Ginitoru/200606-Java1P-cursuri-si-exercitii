package view;

import controller.MainController;
import models.Departament;

import javax.swing.*;
import java.util.List;

public class DepartamentFrame extends JFrame{

    private DefaultListModel<Departament> model;

    private JLabel backGround;
    private JList<Departament> list;
    private JButton adaugaButton;
    private JTextField textField;


    public DepartamentFrame(){
        setTitle("frame");
        setSize(600,800);


        setLocationRelativeTo(null);

        setBackGround();
        setList();

        textField();
        adaugaButton();
        refresh();



        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    private void setBackGround(){
        backGround = new JLabel();
        backGround.setSize(600,800);

        add(backGround);

    }

    private void setList(){
        list = new JList();
        list.setBounds(5,5,570,600);
        list.getCellBounds(400,20);
        model = new DefaultListModel<>();
        backGround.add(list);
        list.setModel(model);
    }

    private void refresh(){
        model.clear();

        List<Departament> departamente = MainController.getInstance().getDepartamente();

        departamente.forEach(departament -> model.addElement(departament));
    }

    private void adaugaButton(){
        adaugaButton = new JButton("Adauga");
        adaugaButton.setBounds(450,700,100,20);
        backGround.add(adaugaButton);
            String nume  = textField.getText();
            Departament d = new Departament(0, nume);
          boolean rez =  MainController.getInstance().adaugaDepartament(d);

          if(rez){
              refresh();
              textField.setText("");
          }




    }

    private void textField(){
        textField = new JTextField();
        textField.setBounds(200,700,100,20);
        textField.requestFocus();
        backGround.add(textField);
    }


}
