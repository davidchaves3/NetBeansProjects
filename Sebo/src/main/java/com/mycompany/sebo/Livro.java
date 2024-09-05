
package com.mycompany.sebo;


public class Livro {
    private int codigo;
    private String titulo;
    private boolean disponivel;
    private double valorCusto;
    
    public double calcularVenda(){
        return valorCusto * 1.5;
    }
    public double getvalorCusto(){
        return valorCusto;
    }
    public void setvalorCusto(double valorCusto){
        this.valorCusto = valorCusto;
    }
    public int getcodigo(){
        return codigo;
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    public String gettitulo(){
        return titulo;
    }
    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public void setdisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", titulo=" + titulo + ", disponivel=" + disponivel + ", valorCusto=" + valorCusto + '}';
    }
    
}
