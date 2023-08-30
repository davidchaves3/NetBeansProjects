package Teste;

public class Automovel {
        String marca, modelo;
        int ano;
        double valor;
        boolean ligado=false;
        
        public void ligar(){ 
            ligado = true;
        }
        public void desligar(){ 
            ligado = false; 
        }
        public String verEstado(){
            if (ligado){
                return "Está ligado!";
            }
            return "Está desligado!";
        }
        
        public void aumentarValor(double adicional){
                valor += adicional;
        }
}
