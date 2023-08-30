/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projaula2_pessoa;

/**
 *
 * @author Madianita Bogo
 */
public class ProjAula2_Pessoa {

    public static void main(String[] args) {
            Pessoa p = new Pessoa();
            p.nome = "Ana Banana";
            p.idade = 20;
            p.altura = 1.7;
            p.peso = 65;
            p.sexo = "Masculino";
            
            System.out.println(p.calcularIMC());
            
            if (p.deveAlistar()){
                System.out.println("Deve");
            }
            else{
                System.out.println("Não deve");
            }
            
               
    }
}
