package THW_Helper_App;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainApp implements ActionListener {
    static Main main;
    static Frame index, home, login, register;

    static ArrayList<Frame> frames = new ArrayList<Frame>();

    Button homeButton, loginButton, registerButton, backToIndex;
    TextField emailAdressInput, passwordInput;

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.createMainObjekt();
        mainApp.bootCalculatorApp(900, 450);
        
        index.setVisible(true);
    }

    void createMainObjekt() {
        main = new Main();
    }

    void invisAllFrames() {
        for (Frame currentFrame : frames) {
            currentFrame.setVisible(false);
        }
    }

    void createObjekts() {
        homeButton = new Button("Home");
        homeButton.addActionListener(this);
        
        loginButton = new Button("Anmelden");
        loginButton.addActionListener(this);
        
        registerButton = new Button("Registrieren");
        registerButton.addActionListener(this);
        
        backToIndex = new Button("Zurück zum Hauptmenü");
        backToIndex.addActionListener(this);

        emailAdressInput = new TextField("Emailadresse", 30);
        passwordInput = new TextField("Passwort", 30);
        
        addObjekts();
    }

    void addObjekts() {
        index.add(loginButton);
        index.add(registerButton);
    }
    
    void bootCalculatorApp(int width, int height) {
        home = new Frame("Home");
        frames.add(home);
        
        home.setSize(width, height);
        home.setLayout(new FlowLayout());

        login = new Frame("Login");
        frames.add(login);

        login.setSize(width, height);
        login.setLayout(new FlowLayout());

        register = new Frame("Registrieren");
        frames.add(register);

        register.setSize(width, height);
        register.setLayout(new FlowLayout());

        index = new Frame("Startseite");
        frames.add(index);

        index.setSize(width, height);
        index.setLayout(new FlowLayout());

        createObjekts();
    }
    
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();
        
        if (buttonPressed == "Home") {
            invisAllFrames();
            home.setVisible(true);
        }
        
        if (buttonPressed == "Anmelden") {
            invisAllFrames();
            login.setVisible(true);
            login.add(emailAdressInput);
            login.add(passwordInput);
            login.add(backToIndex);
        }

        if (buttonPressed == "Registrieren") {
            invisAllFrames();
            register.setVisible(true);
            register.add(emailAdressInput);
            register.add(passwordInput);
            register.add(backToIndex);
        }

        if (buttonPressed == "Zurück zum Hauptmenü") {
            invisAllFrames();
            index.setVisible(true);
        }
    }
}