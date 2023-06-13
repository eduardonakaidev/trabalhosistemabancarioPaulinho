/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

import javax.swing.JOptionPane;

/**
 *
 * @author w10
 */
public class Ex4 {

    public static void main(String[] args) {
        int n;
        String input = JOptionPane.showInputDialog("Informe um número inteiro  ");
        n = Integer.parseInt(input);
        System.out.println(fatorial(n));
    }

    public static int fatorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return fatorial(num - 1) * num;
        }

    }
}
