package com.mycompany.contaterminal;
import java.util.Scanner;

public class ContaTerminal {
    static Scanner entrada = new Scanner(System.in);
    public static String sacar(double saldo, double valorSolicitado){
        if(valorSolicitado > saldo){
           return "SALDO INSUFICIENTE" ;
        }
        saldo = saldo - valorSolicitado ;
        return "OPERAÇÃO REALIZADA" + "\n" + 
                "SALDO: " + saldo;
    }
    public static void main(String[] args) {
        double saldo = 25;
        System.out.print("NOME: ");
        String nome = entrada.nextLine();
        System.out.print("AGGENCIA: ");
        String agencia =  entrada.nextLine();
        System.out.print("CONTA: ");
        String conta =  entrada.nextLine();
        System.out.print("VALOR QUE DESEJA SACAR: ");
        double valorSolicitado = entrada.nextDouble();
        
        System.out.println("CLIENTE: " + nome + "\n" + 
                           "AGENCIA: " + agencia + "\n" +
                           "CONTA: " + conta + "\n" + 
                           "OPERAÇÃO: " + sacar(saldo,valorSolicitado)
                );
        
     
    }
}
