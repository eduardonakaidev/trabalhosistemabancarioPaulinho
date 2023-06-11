/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pccasa.trabalho.sistema.bancario.dados.model;

/**
 *
 * @author eduar
 */
public class Conta {
      private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
    public Conta(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
