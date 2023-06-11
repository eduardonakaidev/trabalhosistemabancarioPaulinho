/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pccasa.trabalho.sistema.bancario.dados;

import com.pccasa.trabalho.sistema.bancario.dados.model.Conta;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class TrabalhoSistemaBancarioDados {

    public static void main(String[] args) {
          final int maximo_contas = 1000000;
        
        
        Conta[] contas = new Conta[maximo_contas];
        
        int numContas = 0; 
        
        String input;
        
        boolean sair = false;
        
        while (!sair) {
            input = JOptionPane.showInputDialog("===== Sistema Bancário ===== \n"
                    + "1. Criar conta\n"
                    + "2. Depositar\n"
                    + "3. Sacar\n"
                    + "4. Consultar saldo\n"
                    + "5. Sair\n"
                    + "Escolha uma opção: ");
          
            int opcao;
            
            opcao = Integer.parseInt(input);
            
            switch (opcao) {
                case 1:
                    if (numContas < maximo_contas) {
                        input = JOptionPane.showInputDialog("Número da conta: \n");
                        int numeroConta;
                        numeroConta = Integer.parseInt(input);
                        
                       String nomeTitular = JOptionPane.showInputDialog("Nome do titular: \n");
                        
                       input = JOptionPane.showInputDialog("Saldo inicial:   \n");
                        double saldoInicial;
                        saldoInicial = Double.parseDouble(input);
                        
                        
                        contas[numContas] = new Conta(numeroConta, nomeTitular, saldoInicial);
                        numContas++;
                        
                        JOptionPane.showMessageDialog(null,"Conta criada com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null,"Limite máximo de contas atingido");
                    }
                    break;
                    
                case 2:
                   input = JOptionPane.showInputDialog("número da conta: ");
                    int numeroContaDeposito  = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("valor a depositar: ");
                    double valorDeposito = Double.parseDouble(input);
                    
                    boolean depositoEncontrado = false;
                    
                    
                    for (int i = 0; i < numContas; i++) {
                        if (contas[i].getNumeroConta() == numeroContaDeposito) {
                            contas[i].depositar(valorDeposito);
                            depositoEncontrado = true;
                            break;
                        }
                    }
                    
                    if (depositoEncontrado) {
                        JOptionPane.showMessageDialog(null,"depósito realizado com sucesso!");
                    } else {
                         JOptionPane.showMessageDialog(null,"conta não existe");
                    }
                    break;
                    
                case 3:
                    input = JOptionPane.showInputDialog("numero da conta: ");
                    int numeroContaSaque = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog("valor a sacar: ");
                    double valorSaque = Double.parseDouble(input);
                    
                    boolean saqueEncontrado = false;
                    
                    
                    for (int i = 0; i < numContas; i++) {
                        if (contas[i].getNumeroConta() == numeroContaSaque) {
                            if (contas[i].sacar(valorSaque)) {
                                saqueEncontrado = true;
                                JOptionPane.showMessageDialog(null,"saque realizado com sucesso");
                            } else {
                                JOptionPane.showMessageDialog(null,"saldo insuficiente para saque");
                            }
                            break;
                        }
                    }
                    
                    if (!saqueEncontrado) {
                        JOptionPane.showMessageDialog(null,"Conta não encontrada!");
                    }
                    break;
                    
                case 4:
                   input = JOptionPane.showInputDialog("Numero da conta: ");
                    int numeroContaConsulta = Integer.parseInt(input);
                    
                    boolean contaEncontrada = false;
                    
                  
                    for (int i = 0; i < numContas; i++) {
                        if (contas[i].getNumeroConta() == numeroContaConsulta) {
                            JOptionPane.showMessageDialog(null,"Saldo: " + contas[i].getSaldo());
                            contaEncontrada = true;
                            break;
                        }
                    }
                    
                    if (!contaEncontrada) {
                        JOptionPane.showMessageDialog(null,"Conta não encontrada");
                    }
                    break;
                    
                case 5:
                    sair = true;
                    JOptionPane.showMessageDialog(null,"Saindo do sistema");
                    break;
                    
                default:
                   JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
            }
            
           JOptionPane.showMessageDialog(null,"");
        
        
    }
    }
}
