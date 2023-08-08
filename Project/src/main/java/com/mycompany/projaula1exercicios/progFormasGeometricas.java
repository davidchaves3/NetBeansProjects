package com.mycompany.projaula1exercicios;

import java.util.Scanner;

public class progFormasGeometricas {
    static Scanner entrada = new Scanner(System.in);
    
    public static double calcularArea(double lado1, double lado2){
        return lado1*lado2;
    }
    
    public static double calcularPerimetro(double lado1, double lado2){
        return lado1*2 + lado2*2;
    }
    
    public static boolean verificarQuadradoPerfeito(double lado1, double lado2){
        return lado1==lado2;
    }
    
    public static void imprimirQuadrado(double lado1, double lado2){
        int cont1 = 0;        
        while (cont1 < lado1) {
            int cont2 = 0;
            while (cont2 < lado2) {
                System.out.print("* "); 
                cont2++;
            }
            System.out.println();
            cont1++; 
        }
    }
    
    public static void main(String args[]) {
        double ld1, ld2;
        
        System.out.println("****Início do Programa***");
        System.out.println("Area: " + calcularArea(10, 20));
        System.out.println("Perimêtro: " + calcularPerimetro(5, 6));
        imprimirQuadrado(3, 6);
        if (verificarQuadradoPerfeito(5, 5)){
            System.out.println("É quadrado perfeito!");
        }
        else{
            System.out.println("Não é um quadrado perfeito!");
        }
        
        //Lê os lados e chama a função
        System.out.print("Digite o lado1: ");
        ld1 = entrada.nextDouble();
        
        System.out.print("Digite o lado2: ");
        ld2 = entrada.nextDouble();       
        
        System.out.println("Area: " + calcularArea(ld1,ld2));
        System.out.println("Perimêtro: " + calcularPerimetro(ld1, ld2));
        imprimirQuadrado(ld1, ld2);        
    }
  
}