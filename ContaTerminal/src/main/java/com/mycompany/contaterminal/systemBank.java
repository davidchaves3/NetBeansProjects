
package com.mycompany.contaterminal;

public class systemBank {
    public static Double sacar(double saldo, double valorSolicitado){
        if(valorSolicitado > saldo){
            System.out.println("SALDO INSUFICIENTE");
           return null;
        }
        System.out.println("OPERAÇÃO REALIZADA");
        return saldo -= valorSolicitado ;
    }
}
