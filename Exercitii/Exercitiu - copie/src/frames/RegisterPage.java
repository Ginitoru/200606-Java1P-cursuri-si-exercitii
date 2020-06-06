package frames;

import files.DataBase;
import files.User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;

public class RegisterPage  extends JFrame {

    private JButton loginPage;
    private JLabel label;
    private JLabel usernameLabel, passwordLabel, genderLabel, languageLabel, countryLabel;
    private JTextField usernameFiled;
    private JPasswordField passwordField;
    private JRadioButton radioButton1, radioButton2;
    private JCheckBox checkBox1, checkBox2;
    private JComboBox combobox;
    private JButton registerButton, resetButton;
    private JMenuBar menuBar;
    private JMenu optionMenu;
    private JMenuItem setLanguage1;
    private JMenuItem setLanguage2;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JTextField firstnameFiled;
    private JTextField lastnameFiled;
    private ButtonGroup buttonGroup;
    private int posX =0, posY =0;


    ImageIcon icon = new ImageIcon("./src/images/locomotiva1.jpg");
    int width = icon.getIconWidth();
    int height = icon.getIconHeight();


    EmptyBorder border;

    public RegisterPage(){
        setTitle("Register Page");
        setLayout(null);
        setUndecorated(true);

        initRegisterPage();
        imageBackground();

        initUsername();
        initPassword();
        initCountry();
        initGender();
        setOptionMenuBar();
        initRegisterButton();
        initResetButton();
        loginPageButton();
        initFairstName();
        initLastName();
        mouseListener();

        setResizable(false);
    }

    private void initRegisterPage(){
        setSize(780, 440);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void imageBackground(){
     label = new JLabel();
        label.setSize(780, 440);
        Image image = new ImageIcon("./src/images/gfr.jpg")
                .getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image2 = new ImageIcon(image);
        label.setIcon(image2);
        add(label);
    }
    private void initUsername(){
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20,40,140,20);
        label.add(usernameLabel);

        usernameFiled = new JTextField();
        usernameFiled.setBounds(20,60,140,20);
       // usernameFiled.setBackground(new Color(0,0,0,0));
        label.add(usernameFiled);

    }

    private void initPassword(){

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20,80,140,20);
        label.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(20,100,140,20);
        label.add(passwordField);

    }

    private void initFairstName(){
        firstnameLabel = new JLabel("First name:");
        firstnameLabel.setBounds(20, 190, 140, 20);
        firstnameFiled = new JTextField();
        firstnameFiled.setBounds(20, 210, 140, 20);
        label.add(firstnameLabel);
        label.add(firstnameFiled);
    }

    private void initLastName(){
        lastnameLabel = new JLabel("Last name:");
        lastnameLabel.setBounds(20, 230, 140, 20);
        lastnameFiled = new JTextField();
        lastnameFiled.setBounds(20, 250, 140, 20);
        label.add(lastnameLabel);
        label.add(lastnameFiled);
    }

    private void initCountry(){
        countryLabel = new JLabel("Country:");
        countryLabel.setBounds(20, 150, 140, 20);
        label.add(countryLabel);


        String [] countries = Stream.of(Locale.getISOCountries())
                .map(countryCode -> new Locale("",countryCode).getDisplayCountry())
                .toArray(String[]::new);

        combobox = new JComboBox(countries);
        combobox.setBounds(20,170,140,20);

        label.add(combobox);
    }


    private void initGender(){

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20,130,50,20);
        label.add(genderLabel);

        radioButton1 = new JRadioButton("M");
        radioButton1.setActionCommand("M");
        radioButton1.setBounds(70,122, 35,35);
        radioButton1.setOpaque(false);

        radioButton2 = new JRadioButton("F");
        radioButton2.setActionCommand("F");
        radioButton2.setBounds(105,122,35,35);
        radioButton2.setOpaque(false);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        label.add(radioButton1);
        label.add(radioButton2);
    }

    private void initRegisterButton(){
        registerButton = new JButton("REGISTER");
        registerButton.setBounds(290,350,100,20);
        label.add(registerButton);
        registerButton.setOpaque(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setBorderPainted(false);
        registerButton.setForeground(Color.WHITE);

        registerButton.addActionListener(ev ->{
            if(valid()){
             //   AuthentificationService.register(usernameFiled.getText(), new String(passwordField.getPassword()));
                if(DataBase.getUsersMap().containsKey(usernameFiled.getText())){
                    JOptionPane.showMessageDialog(null,"Username is allready used! Try a different one");

                }else{
                    User user = new User.Builder()
                            .setUsername(usernameFiled.getText())
                            .setPassword(new String(passwordField.getPassword()))
                            .setGEnder(buttonGroup.getSelection().getActionCommand())
                            .setCountry(Objects.requireNonNull(combobox.getSelectedItem()).toString())
                            .setfirstName(firstnameFiled.getText())
                            .setLastName(lastnameFiled.getText())
                            .build();
                    DataBase.registeringUser(usernameFiled.getText(), user);
                    showMessage("Registration Succesful!", JOptionPane.INFORMATION_MESSAGE);
                    resetRegisterPageFields();
                }
            }
        });
    }

    private void initResetButton(){
      resetButton = new JButton("RESET");
      resetButton.setBounds(390,350, 100,20);
      resetButton.setOpaque(false);
      resetButton.setBorderPainted(false);
      resetButton.setContentAreaFilled(false);
      resetButton.setForeground(Color.WHITE);
      label.add(resetButton);

      resetButton.addActionListener(ev ->{
          resetRegisterPageFields();
          showMessage("Fields Reset!", JOptionPane.INFORMATION_MESSAGE);
      });
    }

    private void loginPageButton(){
        loginPage = new JButton("LOGIN PAGE");
        loginPage.setBounds(190,350, 120,20);
        loginPage.setOpaque(false);
        loginPage.setBorderPainted(false);
        loginPage.setContentAreaFilled(false);
        loginPage.setForeground(Color.WHITE);
        label.add(loginPage);

        loginPage.addActionListener(ev ->{
             LoginPage loginPage= new LoginPage();
             loginPage.setVisible(true);
             dispose();
        });
    }

    private void setOptionMenuBar(){
        menuBar = new JMenuBar();
        optionMenu = new JMenu("Options");
        setLanguage1 = new JMenuItem("Romana");
        setLanguage2 = new JMenuItem("English");
        optionMenu.add(setLanguage1);
        optionMenu.add(setLanguage2);
        menuBar.add(optionMenu);
        label.add(menuBar);

        setJMenuBar(menuBar);
    }

        private boolean valid(){
        if(usernameFiled.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Enter username","Eror",JOptionPane.ERROR_MESSAGE );
            usernameFiled.requestFocus();
            return false;
        }else if(String.valueOf(passwordField.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null,"Enter passwod!","Error",JOptionPane.ERROR_MESSAGE);
            passwordField.requestFocus();
            return false;
        }else if(firstnameFiled.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter first name!", "Error",JOptionPane.ERROR_MESSAGE);
            firstnameFiled.requestFocus();
            return false;
        }else if(lastnameFiled.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Enter last name!", "Error", JOptionPane.ERROR_MESSAGE);
            lastnameFiled.requestFocus();
            return false;
        }else if(Objects.requireNonNull(combobox.getSelectedItem()).toString().equals("Andorra")){
            JOptionPane.showMessageDialog(null, "Select country","Error", JOptionPane.ERROR_MESSAGE);
            combobox.requestFocus();
            return false;
        } else if(buttonGroup.getSelection() == null){
          JOptionPane.showMessageDialog(null, "Select gender!", "Error", JOptionPane.ERROR_MESSAGE);
          return false;
        }
        return true;
        }




    public static void showMessage(String msg, int messageType){
        JOptionPane.showMessageDialog(null,msg,"Bilete Gui", messageType);

    }

    private void resetRegisterPageFields(){
        usernameFiled.setText("");
        passwordField.setText("");
        firstnameFiled.setText("");
        lastnameFiled.setText("");
        buttonGroup.clearSelection();
        usernameFiled.requestFocus();
        combobox.setSelectedItem("");
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







}
