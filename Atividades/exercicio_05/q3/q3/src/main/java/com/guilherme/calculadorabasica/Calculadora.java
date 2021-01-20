package com.guilherme.calculadorabasica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gdsd1
 */
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        // Solicitar a opção desejada pelo usuário
        String opcao;
        opcao = JOptionPane.showInputDialog("Escolha a opcao desejada para a operação:"
                + "\n1 - Soma"
                + "\n2 - Subtração"
                + "\n3 - Multiplicação"
                + "\n4 - Divisão");

        int opt;
        opt = Integer.parseInt(opcao);

        if (opt == 1) {
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Primeiro valor: ");
            n2 = JOptionPane.showInputDialog("Segundo valor: ");

            double numero1 = Double.parseDouble(n1);
            double numero2 = Double.parseDouble(n2);

            double resultado = numero1 + numero2;

            String msg;
            msg = "O Resultado da operação é: " + resultado;
            JOptionPane.showMessageDialog(null, msg);
        }
        if (opt == 2) {
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Primeiro valor: ");
            n2 = JOptionPane.showInputDialog("Segundo valor: ");

            double numero1 = Double.parseDouble(n1);
            double numero2 = Double.parseDouble(n2);

            double resultado = numero1 - numero2;

            String msg;
            msg = "O Resultado da operação é: " + resultado;
            JOptionPane.showMessageDialog(null, msg);
        }
        if (opt == 3) {
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Primeiro valor: ");
            n2 = JOptionPane.showInputDialog("Segundo valor: ");

            double numero1 = Double.parseDouble(n1);
            double numero2 = Double.parseDouble(n2);

            double resultado = numero1 * numero2;

            String msg;
            msg = "O Resultado da operação é: " + resultado;
            JOptionPane.showMessageDialog(null, msg);
        }
        if (opt == 4) {
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog("Primeiro valor: ");
            n2 = JOptionPane.showInputDialog("Segundo valor: ");

            double numero1 = Double.parseDouble(n1);
            double numero2 = Double.parseDouble(n2);

            double resultado = numero1 / numero2;

            String msg;
            msg = "O Resultado da operação é: " + resultado;
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
