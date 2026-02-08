package THW_Helper_App.beispiel;

import java.awt.*;
import java.awt.event.*;

public class CalculatorApp implements ActionListener{
    Calculator calculator;
    Frame calcInterface;



    Label resultLabel;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, 
        buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonCalculate;
    
    String inputOne = "", inputTwo = "";
    double result;
    char calculationMethod = ' ';

    public static void main(String[] args) {
        CalculatorApp calcApp = new CalculatorApp();
        calcApp.createCalculatorObjekt();
        calcApp.bootCalculatorApp();
    }

    void createCalculatorObjekt() {
        calculator = new Calculator();
    } 

    void bootCalculatorApp() {
        calcInterface = new Frame("Tillman's AWT Super Calculator App");
        
        calcInterface.setSize(800, 600);
        calcInterface.setLayout(new GridLayout(5,4));

        createAndAddButtons();

        resultLabel = new Label("");
        
        calcInterface.add(resultLabel);

        calcInterface.setVisible(true);
    }

    void createAndAddButtons() {
        button1 = new Button("1");
        button1.addActionListener(this);
        calcInterface.add(button1);

        button2 = new Button("2");
        button2.addActionListener(this);
        calcInterface.add(button2);

        button3 = new Button("3");
        button3.addActionListener(this);
        calcInterface.add(button3);

        button4 = new Button("4");
        button4.addActionListener(this);
        calcInterface.add(button4);

        button5 = new Button("5");
        button5.addActionListener(this);
        calcInterface.add(button5);

        button6 = new Button("6");
        button6.addActionListener(this);
        calcInterface.add(button6);

        button7 = new Button("7");
        button7.addActionListener(this);
        calcInterface.add(button7);

        button8 = new Button("8");
        button8.addActionListener(this);
        calcInterface.add(button8);

        button9 = new Button("9");
        button9.addActionListener(this);
        calcInterface.add(button9);

        button0 = new Button("0");
        button0.addActionListener(this);
        calcInterface.add(button0);


        buttonPlus = new Button("+");
        buttonPlus.addActionListener(this);
        calcInterface.add(buttonPlus);

        buttonMinus = new Button("-");
        buttonMinus.addActionListener(this);
        calcInterface.add(buttonMinus);

        buttonMultiply = new Button("*");
        buttonMultiply.addActionListener(this);
        calcInterface.add(buttonMultiply);

        buttonDivide = new Button(":");
        buttonDivide.addActionListener(this);
        calcInterface.add(buttonDivide);


        buttonCalculate = new Button("=");
        buttonCalculate.addActionListener(this);
        calcInterface.add(buttonCalculate);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("0123456789".contains(command)) { 
            if (calculationMethod == ' ') {
                inputOne = inputOne + command;
                resultLabel.setText(inputOne);
            }
            else if (calculationMethod != ' ') {
                inputTwo = inputTwo + command;
                resultLabel.setText(inputOne + " " + calculationMethod + " " + inputTwo + " = -----");                
            }

        }
        else if (command == "+") {
            calculationMethod = '+';
            resultLabel.setText(inputOne + " " + calculationMethod + " ");
        }

        else if (command == "-") {
            calculationMethod = '-';
            resultLabel.setText(inputOne + " " + calculationMethod + " ");
        }

        else if (command == "*") {
            calculationMethod = '*';
            resultLabel.setText(inputOne + " " + calculationMethod + " ");
        }

        else if (command == ":") {
            calculationMethod = ':';
            resultLabel.setText(inputOne + " " + calculationMethod + " ");
        }

        else if (command == "=" & inputOne != "" & inputTwo != "") {
            if(calculationMethod == '+') {
                result = calculator.add(Integer.parseInt(this.inputOne), Integer.parseInt(this.inputTwo));
            }
            else if(calculationMethod == '-') {
                result = calculator.substrakt(Integer.parseInt(this.inputOne), Integer.parseInt(this.inputTwo));
            }

            else if(calculationMethod == '*') {
                result = calculator.multiply(Integer.parseInt(this.inputOne), Integer.parseInt(this.inputTwo));
            }

            else if(calculationMethod == ':') {
                result = calculator.divide(Double.parseDouble(this.inputOne), Double.parseDouble(this.inputTwo));
            }

            resultLabel.setText(inputOne + " " + calculationMethod + " " + inputTwo + " = " + result);

            calculationMethod = ' ';
            inputOne = "";
            inputTwo = "";
        }

        else {
            resultLabel.setText("Werte sind nicht vollständig.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            resultLabel.setText("");

            calculationMethod = ' ';
            inputOne = "";
            inputTwo = "";
        }

    }
}
