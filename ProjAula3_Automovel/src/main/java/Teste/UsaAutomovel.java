package Teste;


public class UsaAutomovel {
    public static void main(String args[]) {
            Automovel carro = new Automovel();
            
            carro.marca = "Fiat";
            carro.modelo = "UNO Mille";
            carro.ano = 2005;
            carro.valor = 15000;
            
            System.out.println(carro.verEstado() + "  " + carro.valor);
            carro.ligar();
            carro.aumentarValor(1000);
            System.out.println(carro.verEstado() + "  " + carro.valor); 
    }
}
