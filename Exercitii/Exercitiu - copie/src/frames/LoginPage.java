package frames;

import files.DataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage extends JFrame {

    private JLabel label;
    private JButton registerButton;
    private JButton loginButton;
    private JButton xButton;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JTextField userNameField;
    private JPasswordField passwordField;
    private int posX = 0, posY = 0;

    ImageIcon image = new ImageIcon("./src/images/tren.jpg");

    int width = image.getIconWidth();
    int height = image.getIconHeight();


    public LoginPage() {
        setTitle("FORTZA FIE CU NASU:DDDD");

        setSize(780, 440);
        setUndecorated(true);
        initBackGroundImage();
        mouseListener();
        initXbutton();

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initBackGroundImage() {
        label = new JLabel();
        label.setSize(width, height);
        Image image = new ImageIcon("./src/images/tren.jpg")
                .getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image2 = new ImageIcon(image);
        label.setIcon(image2);

        initUsername();
        initPassword();

        add(label);
    }

    private void initUsername() {
        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(360, 20, 140, 20);

        userNameField = new JTextField("username");
        userNameField.setBounds(320, 40, 140, 20);
        userNameField.setOpaque(false);
        userNameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                userNameField.setText("");
            }
        });


        label.add(userNameField);
        label.add(userNameLabel);
        initButtons();
    }

    private void initPassword() {

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(360, 60, 140, 20);

        passwordField = new JPasswordField("username");
        passwordField.setBounds(320, 80, 140, 20);
        passwordField.setOpaque(false);


        label.add(passwordField);
        label.add(passwordLabel);
    }

    public void initButtons() {

        loginButton = new JButton("Login");
        loginButton.setBounds(340, 300, 100, 20);
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setForeground(Color.WHITE);



        loginButton.addActionListener(ev -> {
            if (DataBase.DBLogin(userNameField.getText(), new String(passwordField.getPassword()))) {
                //  AuthentificationService.login(userNameField.getText(), new String(passwordField.getPassword()))
                DashboardPage dashboardPage = new DashboardPage();
                dashboardPage.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credentiale incorecte!");
                userNameField.setText("");
                passwordField.setText("");
                userNameField.requestFocus();
            }
        });

        registerButton = new JButton("Register");
        registerButton.setBounds(340, 325, 100, 20);
        registerButton.addActionListener(ev -> actionRegisterButton());
       // registerButton.setBorderPainted(false);
        registerButton.setOpaque(false);


       // registerButton.setBorder(border);

        registerButton.setContentAreaFilled(false);
        registerButton.setForeground(Color.WHITE);

        label.add(loginButton);
        label.add(registerButton);
    }

    private void actionRegisterButton() {
        RegisterPage registerPage = new RegisterPage();
        registerPage.setVisible(true);
        dispose();
    }

    private void mouseListener() {
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {

                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);

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
        xButton.setBounds(745,3, 45,30);
        label.add(xButton);
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }
}
