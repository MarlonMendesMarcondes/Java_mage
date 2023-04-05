package Calculadora.Learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraCientifica extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTextField visor;
    private String operacao;
    private double resultado;
    private boolean novaOperacao;

    public CalculadoraCientifica() {
        setTitle("Calculadora Científica");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelVisor = new JPanel();
        painelVisor.setBackground(Color.BLACK);
        visor = new JTextField("0", 20);
        visor.setEditable(false);
        visor.setFont(new Font("Arial", Font.BOLD, 40));
        visor.setForeground(Color.WHITE);
        visor.setHorizontalAlignment(JTextField.RIGHT);
        painelVisor.add(visor);
        add(painelVisor, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(5, 4, 5, 5));
        painelBotoes.setBackground(Color.DARK_GRAY);
        add(painelBotoes, BorderLayout.CENTER);

        JButton botaoCE = new JButton("CE");
        botaoCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visor.setText("0");
                resultado = 0;
                novaOperacao = true;
            }
        });
        painelBotoes.add(botaoCE);

        JButton botaoC = new JButton("C");
        botaoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visor.setText("0");
            }
        });
        painelBotoes.add(botaoC);

        JButton botaoBackspace = new JButton("\u2190");
        botaoBackspace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = visor.getText();
                int tamanho = texto.length();
                if (tamanho > 1) {
                    visor.setText(texto.substring(0, tamanho - 1));
                } else {
                    visor.setText("0");
                }
            }
        });
        painelBotoes.add(botaoBackspace);

        JButton botaoDivisao = new JButton("\u00F7");
        botaoDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao = "/";
                resultado = Double.parseDouble(visor.getText());
                novaOperacao = true;
            }
        });
        painelBotoes.add(botaoDivisao);

        JButton botao7 = new JButton("7");
        botao7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarVisor("7");
            }
        });
        painelBotoes.add(botao7);

        JButton botao8 = new JButton("8");
        botao8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarVisor("8");
            }
        });
        painelBotoes.add(botao8);

        JButton botao9 = new JButton("9");
        botao9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarVisor("9");
            }
        });
        painelBotoes.add(botao9);

        JButton botaoMultiplicacao = new JButton("\u00D7");
        botaoMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao = "*";
                resultado = Double.parseDouble(visor.getText());
                novaOperacao = true;
            }
        });
    }
}