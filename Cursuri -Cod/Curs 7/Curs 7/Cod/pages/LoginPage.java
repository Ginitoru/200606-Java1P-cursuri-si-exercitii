package BileteTrenGUI.pages;

import BileteTrenGUI.AuthenticationService;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginPage extends JFrame {

    JPanel panel;

    JButton loginButton;
    JButton registerButton;
    JTextField usernameField;
    JPasswordField passwordField;
    JLabel usernameLabel;
    JLabel passwordLabel;

    LoginPage() {
        super("Login Autentification");
        setSize(300, 100);
        setLocationRelativeTo(null);

        EmptyBorder border = new EmptyBorder(0, 10, 0, 0);

        usernameLabel = new JLabel("User Name:");
        usernameLabel.setBorder(border);
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBorder(border);

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(loginButton);
        panel.add(registerButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);

        setVisible(true);

        loginButton.addActionListener(e -> {
            if (AuthenticationService.login(usernameField.getText(), new String(passwordField.getPassword()))) {
                DashboardPage dashboardPage = new DashboardPage();
                dashboardPage.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credentiale incorecte!");
                usernameField.setText("");
                passwordField.setText("");
                usernameField.requestFocus();
            }
        });

        registerButton.addActionListener(e -> {
            RegisterPage registerPage = new RegisterPage();
            registerPage.setVisible(true);
            dispose();
        });
    }
}