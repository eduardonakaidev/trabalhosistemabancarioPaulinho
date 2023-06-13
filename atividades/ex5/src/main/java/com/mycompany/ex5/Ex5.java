/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;

/**
 *
 * @author w10
 */
public class Ex5 {

    public static void main(String[] args) {
int number = 20; 
System.out.println("Sequência Fibonacci de " + number + ":");
            for (int i = 0; i <= number; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
    }
}
