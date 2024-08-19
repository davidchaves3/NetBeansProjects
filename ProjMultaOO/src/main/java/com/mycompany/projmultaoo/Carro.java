/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projmultaoo;

/**
 *
 * @author Chaves
 */
public class Carro {
    String tipoCarro;
    double velocidade_max, velocidade;
    public double calcularMulta(){
        double multa = 0;
        
        if(tipoCarro.equalsIgnoreCase("ambulância") || tipoCarro.equalsIgnoreCase("polícia")|| tipoCarro.equalsIgnoreCase("bombeiro")){
            return multa;  
        }
        
        if (velocidade > velocidade_max){
         multa = 10 * (velocidade - velocidade_max);
        }

        return multa;
    }
}
