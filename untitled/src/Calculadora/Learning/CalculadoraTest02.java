package Calculadora.Learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraTest02 implements ActionListener {
    private JFrame frame;
    private JTextField field1, field2, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    public CalculadoraTest02() {
        frame = new JFrame("Calculadora");
        frame.setLayout(new GridLayout(3, 3));

        field1 = new JTextField();
        field2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        frame.add(new JLabel("Número 1:"));
        frame.add(field1);
        frame.add(new JLabel("Número 2:"));
        frame.add(field2);
        frame.add(new JLabel("Resultado:"));
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);

        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(field1.getText());
        double num2 = Double.parseDouble(field2.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subButton) {
            result = num1 - num2;
        } else if (e.getSource() == mulButton) {
            result = num1 * num2;
        } else if (e.getSource() == divButton) {
            result = num1 / num2;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new CalculadoraTest02();
    }
}