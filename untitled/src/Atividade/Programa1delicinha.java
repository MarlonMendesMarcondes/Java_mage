package Atividade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Programa1delicinha extends JFrame implements Action {
    JTextField text;
    JLabel label;
    public Programa1delicinha(){
        setVisible(true);
        setSize(800,600);
        setTitle("Exercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        text = new JTextField();
        text.setBounds(250,350,300,25);
        text.setFont(new Font("Arial",Font.PLAIN,15));
        text.setText("Insira um numero inteiro");
        setVisible(true);
        add(text);

        JButton jButton = new JButton("Clique para mostrar o número");
        jButton.setBounds(250,400,300,25);
        jButton.setFont(new Font("Arial",Font.PLAIN,15));
        jButton.setForeground(Color.BLACK);
        jButton.setBackground(Color.white);
        add(jButton);

        JButton jButton2 = new JButton("Nao clique neste Botao");
        jButton2.setBounds(0,0,300,25);
        jButton2.setFont(new Font("Arial",Font.PLAIN,15));
        jButton2.setForeground(Color.BLACK);
        jButton2.setBackground(Color.white);
        add(jButton2);

        jButton.addActionListener(this);
        jButton2.addActionListener(this::botaonclique);

        label = new JLabel();
        label.setBounds(250, 300, 300, 25);
        label.setFont(new Font("Arial",Font.PLAIN,15));
        add(label);
    }

    private void botaonclique(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,
                "Meu pau na sua Mão","Clicou no botao",
                JOptionPane.INFORMATION_MESSAGE);
    }


    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateLabel();

    }
    private boolean isNumeroValido(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    private void updateLabel() {
        String texto = text.getText();
        if (isNumeroValido(texto)) {
            label.setText("Numero digitado: "+texto);
        }
    }
    public static void main(String[] args) {
        new Programa1delicinha();
    }
}
