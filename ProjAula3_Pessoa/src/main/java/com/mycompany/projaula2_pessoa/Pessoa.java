
package com.mycompany.projaula2_pessoa;

public class Pessoa {
        String nome, sexo; 
        int idade;
        double peso, altura;
        
        public boolean ehMaior(){
                return idade >= 18;
        }
        
        public double calcularIMC(){
                double imc = peso/Math.pow(altura, 2);
                return Math.round(imc * 100.0) /100.0;
        }
        
        public boolean deveAlistar(){
                return idade>=18 && sexo.equalsIgnoreCase("masculino");
        }
        
}
