package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import java.util.ResourceBundle;

public class StartPage extends JFrame {


    private JButton xButton;
    private JButton loginButton;
    private JButton registerButton;
    private Image image;
    private JLabel label, labelLanguageEnglish, labelLanguageRomanian;
    private JCheckBox checboxLanguage1, checboxLanguage2;
    private ButtonGroup buttonGroup;
    private LoginPage loginPage;





    private int posX =0, posY =0;


    public StartPage(){
        super("Start Page");

        initFrame();
        setBackgroundImage();
        loginButton();
        registerButton();
        setChecboxLanguage();
        mouseListener();
        initXbutton();



        setUndecorated(true);
        setVisible(true);
        setResizable(false);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
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

    private void initFrame(){
        setSize(780,440);
        setLocationRelativeTo(null);
    }

    private void setBackgroundImage(){
        label = new JLabel();
        label.setSize(800,440);
        image = new ImageIcon("./src/images/locomotiva1.jpg")
                .getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image2 = new ImageIcon(image);
        label.setIcon(image2);
        add(label);

    }

    private void loginButton(){
        loginButton = new JButton("login");
        loginButton.setBounds(270,360,110,20);

//        loginButton.setOpaque(false);
//        loginButton.setBorderPainted(false);
//        loginButton.setContentAreaFilled(false);
//        loginButton.setForeground(Color.ORANGE);
        loginButton.addActionListener(ev->{
           LoginPage loginPage = new LoginPage();
           loginPage.setVisible(true);
           dispose();
        });
        label.add(loginButton);
    }

    private void registerButton(){
        registerButton = new JButton("register");
        registerButton.setBounds(400,360, 110,20);
        registerButton.addActionListener(ev->{
            RegisterPage registerPage = new RegisterPage();
            registerPage.setVisible(true);
            dispose();
        });

        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                registerButton.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                registerButton.setBackground(Color.CYAN);
            }
        });
        label.add(registerButton);
    }

    private void setChecboxLanguage(){


        Image image1 = new ImageIcon("./src/images/UK.png")
                .getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        ImageIcon imageIcon1 = new ImageIcon(image1);

        Image image2 = new ImageIcon("./src/images/RO.png")
                .getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH);
        ImageIcon imageIcon2 = new ImageIcon(image2);

        labelLanguageEnglish = new JLabel();
        labelLanguageEnglish.setIcon(imageIcon1);
        labelLanguageEnglish.setBounds(340,400,20,20);
        label.add(labelLanguageEnglish);

        labelLanguageRomanian = new JLabel();
        labelLanguageRomanian.setIcon(imageIcon2);
        labelLanguageRomanian.setBounds(420,400,20,20);
        label.add(labelLanguageRomanian);


        buttonGroup = new ButtonGroup();

        checboxLanguage1 = new JCheckBox();
        checboxLanguage1.setBounds(362,400,20,20);
        checboxLanguage1.setContentAreaFilled(false);
        buttonGroup.add(checboxLanguage1);

        checboxLanguage1.addActionListener(e->internationalization("en", "UK"));


        checboxLanguage2 = new JCheckBox();
        checboxLanguage2.setBounds(398,400,20,20);
        checboxLanguage2.setContentAreaFilled(false);
        buttonGroup.add(checboxLanguage2);
        checboxLanguage2.addActionListener(e-> internationalization("ro", "RO"));

        label.add(checboxLanguage1);
        label.add(checboxLanguage2);

    }


    private void initXbutton(){





//        image = new ImageIcon("./src/images/Xbutton.png")
//                .getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image2 = new ImageIcon("./src/images/Xbutton20.png");
        xButton = new JButton(image2);


        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
     //   xButton.setBorderPainted(false);
      //  xButton.setForeground(Color.RED);
        xButton.addActionListener(ev-> dispose());
        xButton.setBounds(757,3, 20,20);
        label.add(xButton);
    }





    private void internationalization(String language, String country){
        loginPage =  new LoginPage();
       loginPage.setVisible(false);

        Locale locale = new Locale.Builder()
                .setLanguage(language)
                .setRegion(country)
                .build();

        ResourceBundle bundle = ResourceBundle.getBundle("translate", locale);

        loginButton.setText( bundle.getString("login"));
        registerButton.setText(bundle.getString("register"));
        loginPage.getLoginButton().setText(bundle.getString("login"));
        loginPage.getRegisterButton().setText(bundle.getString("register"));


    }



}
