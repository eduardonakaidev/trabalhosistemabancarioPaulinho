/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author w10
 */
public class Ex3 {

    public static void main(String[] args) {
               int contagem = 0;
        System.out.println("Iniciando contagem regressiva: ");
        contagemRegressiva(contagem);
    }

    public static void contagemRegressiva(int numero) {
        if (numero == 50) {
            System.out.println("Explosão");
        } else {
            System.out.println(numero);
            contagemRegressiva(numero = numero + 1);
        }
    }
}
