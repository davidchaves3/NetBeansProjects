/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06poo;

public class Professor {
    private String cpf, nome;
    private double chSemanal, valorHora;
    private Idioma idioma;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getChSemanal() {
        return chSemanal;
    }

    public void setChSemanal(double chSemanal) {
        this.chSemanal = chSemanal;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
    @Override
    public String toString() {
        return "Professor{" + "cpf=" + cpf + ", nome=" + nome 
                + ", chSemanal=" + chSemanal + ", valorHora=" + valorHora 
                + ", idioma=" + idioma + '}';
    }
    
    public double calcularSalario(){
        return chSemanal*valorHora*4.5;
    }
    
    //o nome, o nome do idioma que ele ensina e o seu salário mensal. 
    public String getInformacoes(){
        return nome + " - " + idioma.getNome() + " - Salário: " + calcularSalario();
    }
    
    
}
