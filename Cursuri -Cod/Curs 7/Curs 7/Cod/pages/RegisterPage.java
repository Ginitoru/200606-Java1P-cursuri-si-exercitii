package BileteTrenGUI.pages;

import BileteTrenGUI.AuthenticationService;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Locale;
import java.util.stream.Stream;


public class RegisterPage extends JFrame {
    JPanel panel;
    JLabel usernameLabel, passwordLabel, genderLabel, languageLabel, countryLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JRadioButton radioButton1, radioButton2;
    JCheckBox checkBox1, checkBox2;
    JComboBox comboBox;
    JButton registerButton, resetButton;
    EmptyBorder border;

    public RegisterPage() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Register");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(6, 2));
        border = new EmptyBorder(0, 10, 0, 0);

        initUsername();
        initPassword();
        initGender();
        initLanguage();
        initCountry();

        initRegisterButton();
        initResetButton();

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void initUsername() {
        usernameLabel = new JLabel("Username");
        usernameLabel.setBorder(border);
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);
    }

    private void initPassword() {
        passwordLabel = new JLabel("Enter Password");
        passwordLabel.setBorder(border);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);
    }

    private void initGender() {
        genderLabel = new JLabel("Gender");
        genderLabel.setBorder(border);
        panel.add(genderLabel);

        radioButton1 = new JRadioButton("Male");
        radioButton2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);

        JPanel radioButtonsPanel = new JPanel();
        radioButtonsPanel.add(radioButton1);
        radioButtonsPanel.add(radioButton2);
        panel.add(radioButtonsPanel);
    }

    private void initLanguage() {
        languageLabel = new JLabel("Language");
        languageLabel.setBorder(border);
        panel.add(languageLabel);

        checkBox1 = new JCheckBox("Java");
        checkBox2 = new JCheckBox("Php");

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(checkBox1);
        checkBoxPanel.add(checkBox2);
        panel.add(checkBoxPanel);
    }

    private void initCountry() {
        countryLabel = new JLabel("Country");
        countryLabel.setBorder(border);
        panel.add(countryLabel);

        String[] countries = Stream.of(Locale.getISOCountries())
                .map(countryCode -> new Locale("", countryCode).getDisplayCountry())
                .toArray(String[]::new);
        comboBox = new JComboBox(countries);
        comboBox.setBounds(190, 180, 150, 30);
        panel.add(comboBox);
    }

    private void initRegisterButton() {
        registerButton = new JButton("Register");
        panel.add(registerButton, BorderLayout.SOUTH);
        registerButton.addActionListener(e -> {
            if (valid()) {
                AuthenticationService.register(usernameField.getText(), new String(passwordField.getPassword()));
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
                showMessage("Registration Successful!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });
    }

    private void initResetButton() {
        resetButton = new JButton("Reset");
        panel.add(resetButton);
        resetButton.addActionListener(event -> {
            usernameField.setText("");
            passwordField.setText("");
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            showMessage("Fields Reset!", JOptionPane.INFORMATION_MESSAGE);
        });
    }


    private boolean valid() {
        if (usernameField.getText().equals("")) {
            showMessage("Please enter Username", JOptionPane.ERROR_MESSAGE);
            usernameField.requestFocus();
            return false;
        } else if (String.valueOf(passwordField.getPassword()).equals("")) {
            showMessage("Please enter Password", JOptionPane.ERROR_MESSAGE);
            passwordField.requestFocus();
            return false;
        } else if (comboBox.getSelectedItem().toString().equals("Andorra")) {
            showMessage("Please select country!", JOptionPane.ERROR_MESSAGE);
            comboBox.requestFocus();
            return false;
        }
        return true;
    }

    public static void showMessage(String msg, int messageType) {
        JOptionPane.showMessageDialog(null, msg, "Bilete GUI", messageType);
    }
}