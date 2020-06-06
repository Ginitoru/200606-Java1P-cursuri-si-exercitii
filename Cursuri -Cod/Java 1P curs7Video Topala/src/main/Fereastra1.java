package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra1 extends JFrame {
    private JButton button;
    private JLabel label;

   public Fereastra1(){
       initFrame();
       button = new JButton("APASA APASA APASA !!");
        add(button);
        label = new JLabel("0");
        add(label, BorderLayout.NORTH);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = label.getText();
                Integer i = Integer.parseInt(text);
                i++;
                if(i == 10){
                    dispose();
                }

                label.setText(String.valueOf(i));
            }
        });





    }

    private void initFrame(){
        setTitle("bum");
        setSize(400,500);
        setLocationRelativeTo(null);
        setVisible(true);

    }



}
