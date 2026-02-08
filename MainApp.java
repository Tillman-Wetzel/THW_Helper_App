package THW_Helper_App;

import java.awt.*;
import java.awt.event.*;

public class MainApp implements ActionListener {
    static Main main;
    static Frame home, login;

    Button homeButton, loginButton;

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.createMainObjekt();
        mainApp.bootCalculatorApp("THW Helper App", 800, 450);
        
        home.setVisible(true);
    }

    void createMainObjekt() {
        main = new Main();
    }

    void createObjekts() {
        homeButton = new Button("Home");
        homeButton.addActionListener(this);
        login.add(homeButton);

        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        home.add(loginButton);
    }
    
    void bootCalculatorApp(String title, int width, int height) {
        home = new Frame(title);
        
        home.setSize(width, height);
        home.setLayout(new GridLayout(5,4));

        login = new Frame(title);

        login.setSize(width, height);
        login.setLayout(new GridLayout(5, 4));

        createObjekts();
    }
    
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();
        
        if (buttonPressed == "Home") {
            home.setVisible(true);
            login.setVisible(false);
        }
        
        if (buttonPressed == "Login") {
            login.setVisible(true);
            home.setVisible(false);
        }
    }
}
