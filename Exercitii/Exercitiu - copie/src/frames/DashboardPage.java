package frames;

import files.Ticket;
import files.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DashboardPage extends JFrame {

   private JLabel label, label2, priceLabel;
   private Image image, image3;
   private JLabel tipTrenLabel, plecariLabel, sosiriLabel, pretPerKmLabel,kmLabel, pretBiletLabel;
   private JRadioButton personalRadiobutton, acceleratRadioButton, rapidRadiobutton;
   private JComboBox plecariCombobox, sosiriCombobox;
   private ButtonGroup buttonGroup;
   private JButton buyButton;
   private JButton cancelButton;
   private JButton getPrice;
   private JButton xButton;
   private JLabel clockLabel;
   private int timeDelay = 1000;
   private ActionListener time;
   private double indexSpeed = 0;
   double price =0;
    private int posX =0, posY =0;









    public DashboardPage(){
        super("Vanzare bilete");
        setSize(1200,440);
        setLayout(null);

        initBackGround();
        initBackGround2();
        initTipTren();
        initPlecari();
        initSosiri();
        initBuyButton();
        initCancelButton();
        initGetPriceButton();
        initPrice();
        mouseListener();
        initXbutton();
        initClock();

        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initBackGround(){
        label = new JLabel();
        label.setBounds(0,0,780,440);
        image = new ImageIcon("./src/images/tren2.jpg")
                .getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image2 = new ImageIcon(image);
        label.setIcon(image2);
        add(label);
   }

   private void initBackGround2(){
       label2 = new JLabel();

       label2.setBounds(780,0,420,440);
       image3 = new ImageIcon("./src/images/tren2.jpg")
               .getImage().getScaledInstance(label2.getWidth(), label2.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon image2 = new ImageIcon(image3);
      // label2.setIcon(image2);
       add(label2);
   }

   public void initTipTren(){
        tipTrenLabel= new JLabel("Tip tren:");
        tipTrenLabel.setBounds(20,20,100,20);
        label2.add(tipTrenLabel);

        personalRadiobutton = new JRadioButton("Personal");
        personalRadiobutton.setBounds(20,40,100,30);
        personalRadiobutton.setActionCommand("Personal");


        acceleratRadioButton = new JRadioButton("Accelerat");
        acceleratRadioButton.setBounds(120,40,100,30);
        acceleratRadioButton.setActionCommand("Accelerat");

        rapidRadiobutton = new JRadioButton("Rapid");
        rapidRadiobutton.setBounds(250,40,100,30);
        rapidRadiobutton.setActionCommand("Rapid");

        label2.add(personalRadiobutton);
        label2.add(rapidRadiobutton);
        label2.add(acceleratRadioButton);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(personalRadiobutton);
        buttonGroup.add(acceleratRadioButton);
        buttonGroup.add(rapidRadiobutton);


    }

    private void initPlecari(){
        String orase [] = {"Bucuresti", "Constanta","Cluj-Napoca"};

        plecariLabel = new JLabel("Departure");
        plecariLabel.setBounds(20,70,150,20);
        label2.add(plecariLabel);

        plecariCombobox = new JComboBox(orase);
        plecariCombobox.setBounds(20,100,150,20);
        label2.add(plecariCombobox);
    }

    private void initSosiri(){

        String orase [] = {"Bucuresti", "Constanta","Cluj-Napoca"};

        sosiriLabel = new JLabel("Arival");
        sosiriLabel.setBounds(220,70,150,20);
        label2.add(sosiriLabel);

        sosiriCombobox = new JComboBox(orase);
        sosiriCombobox.setBounds(220,100,150,20);
        label2.add(sosiriCombobox);
    }

    private void initBuyButton(){
        buyButton = new JButton("Buy");
        buyButton.setBounds(20,320,365,20);
        buyButton.addActionListener(ev -> buyTichet());

        label2.add(buyButton);
    }

    private void initCancelButton(){
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(20,350,365,20);
        label2.add(cancelButton);
        cancelButton.addActionListener(ev-> System.exit(0));
    }

    private void initGetPriceButton(){
        getPrice = new JButton("Get price");
        getPrice.setBounds(20,200,365,20);
        getPrice.addActionListener(ev -> getPrice());


        label2.add(getPrice);
    }

    private void initPrice(){
        priceLabel = new JLabel("0");
        priceLabel.setFont(new Font("Serif",Font.PLAIN,40));
        priceLabel.setBounds(200,240,100,60);
        label2.add(priceLabel);
    }


    private void getPrice(){

        if(validFields()){
            if((Objects.requireNonNull(plecariCombobox.getSelectedItem()).toString().equals("Bucuresti") &&
            Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString().equals("Cluj-Napoca")) ||
            plecariCombobox.getSelectedItem().toString().equals("Cluj-Napoca") &&
            Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString().equals("Bucuresti")){
                price  = 350*indexSpeed(buttonGroup.getSelection().getActionCommand());

                priceLabel.setText(String.valueOf(price));
            }

            if((plecariCombobox.getSelectedItem().toString().equals("Bucuresti") &&
                    Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString().equals("Constanta")) ||
                    plecariCombobox.getSelectedItem().toString().equals("Constanta") &&
                            Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString().equals("Bucuresti")){
                    price  = 250*indexSpeed(buttonGroup.getSelection().getActionCommand());
                priceLabel.setText(String.valueOf(price));
            }

            if((plecariCombobox.getSelectedItem().toString().equals("Cluj-Napoca") &&
                    Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString().equals("Constanta")) ||
                    plecariCombobox.getSelectedItem().toString().equals("Constanta") &&
                            Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString().equals("Cluj-Napoca")){
                price  = 450*indexSpeed(buttonGroup.getSelection().getActionCommand());
                priceLabel.setText(String.valueOf(price));
            }
        }
    }

    private boolean validFields(){
        if(buttonGroup.getSelection() == null){
            JOptionPane.showMessageDialog(null,"Select the type of train");
            return false;
        }else if(Objects.requireNonNull(plecariCombobox.getSelectedItem()).toString().equals(Objects.requireNonNull(sosiriCombobox.getSelectedItem()).toString())){
            JOptionPane.showMessageDialog(null,"Please select different destinations!");
            return false;
        }
        return true;
    }

    private void buyTichet(){
        if(Double.parseDouble(priceLabel.getText()) !=0){
            if(validFields()){
                Ticket ticket = new Ticket();
                ticket.setPrice(Double.parseDouble(priceLabel.getText()));
                User.getTicketsList().add(ticket);
                JOptionPane.showMessageDialog(null, "Gz, you bought a ticket!");
                buttonGroup.clearSelection();
                sosiriCombobox.setSelectedItem("");
                plecariCombobox.setSelectedItem("");
                priceLabel.setText("0");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ticket is emty!");
        }
    }
    private double indexSpeed(String x){

        switch(x){

            case "Personal":
                indexSpeed =1;
                break;
            case "Accelerat":
                indexSpeed =1.5;
                break;
            case "Rapid":
                indexSpeed =2;
                break;
        }
        return indexSpeed;
    }

    private void mouseListener(){
        this.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                posX=e.getX();
                posY=e.getY();
            }
        });

        this.addMouseMotionListener(new MouseAdapter()
        {
            public void mouseDragged(MouseEvent evt)
            {
                setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
            }
        });
    }

    private void initXbutton(){
        xButton = new JButton("X");

        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        xButton.setForeground(Color.RED);
        xButton.addActionListener(ev-> dispose());
        xButton.setBounds(383,0, 45,30);
        label2.add(xButton);
    }

    private void initClock(){
        clockLabel = new JLabel();
        clockLabel.setBounds(160,135,115,60);
        clockLabel.setFont(new Font("Serif",Font.ITALIC,20));
        DateTimeFormatter timeFormatter = DateTimeFormatter
                .ofPattern("HH:mm:ss");

        time = e -> clockLabel.setText(LocalTime.now().format(timeFormatter));
        new Timer(timeDelay,time).start();

        label2.add(clockLabel);
    }
}







