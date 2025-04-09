package com.mycompany.exercicio10;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        int soma = numero1 + numero2;

        if (soma >= 10) {
            JOptionPane.showMessageDialog(null, "O resultado é maior que 10: " + soma);

        } else {
            JOptionPane.showMessageDialog(null, "O resultado não é maior que 10!");

        }

    }
}
