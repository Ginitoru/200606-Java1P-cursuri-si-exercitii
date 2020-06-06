package BileteTrenGUI.pages;

import javax.swing.*;
import java.awt.*;

public class StartPage extends JFrame {

    private JPanel buttonPanel;
    private JButton loginButton, registerButton;

    public StartPage() {
        initComponents();
        setSize(100, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        buttonPanel = new JPanel();
        LayoutManager layoutManager = new FlowLayout();
        buttonPanel.setLayout(layoutManager);

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        loginButton.addActionListener(event -> {
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
            dispose();
        });


        registerButton.addActionListener(event -> {
            RegisterPage registerPage = new RegisterPage();
            registerPage.setVisible(true);
            dispose();
        });

        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        add(buttonPanel);
    }
}
