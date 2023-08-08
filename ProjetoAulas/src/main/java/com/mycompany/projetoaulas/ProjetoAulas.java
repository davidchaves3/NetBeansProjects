
package com.mycompany.projetoaulas;
import java.util.Scanner;
public class ProjetoAulas {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static double vendedor(double qtdHoras){
        
        double valor = 50;
        return qtdHoras * valor;
    }
    public static double assistente(double qtdHoras){
        
        double valor = 30;
        return qtdHoras * valor;
    }
    public static double recepcionista(double qtdHoras){
        
        double valor = 40;
        return qtdHoras * valor;
    }
    
    public static void main(String[] args) {
        
        System.out.println("================== START ==================");
        String continuar = "S";
        String nome, funcao;
        int codigo;
        double qtdHoras;
        
        while(continuar == "S"){
            System.out.print("Continuar? SIM(S) OU NÃO: ");
            continuar = entrada.nextLine();
            
            System.out.print("NOME:");
            nome = entrada.nextLine();
            
            System.out.print("Código:");
            codigo = entrada.nextInt();
            
            System.out.print("Função:");
            funcao = entrada.nextLine();
            
            System.out.println("Qtd de Horas Trabalhadas:");
            qtdHoras = entrada.nextDouble();
            
            if (funcao.equals("vendedor")){
                
                System.out.println("Nome do Colaborador: " + nome +
                                   "Função: " + funcao + 
                                   "Código: " + codigo +
                                   "Qtd de Horas Trabalhadas: " + qtdHoras + "H" + 
                                   "Valor: " + vendedor(qtdHoras));
            }
            else if(funcao.equals("assistente")){
                
                System.out.println("Nome do Colaborador: " + nome +
                                   "Função: " + funcao + 
                                   "Código: " + codigo +
                                   "Qtd de Horas Trabalhadas: " + qtdHoras + "H" + 
                                   "Valor: " + assistente(qtdHoras));
            }
            else if(funcao.equals("recepcionista")){
                
                System.out.println("Nome do Colaborador: " + nome +
                                   "Função: " + funcao + 
                                   "Código: " + codigo +
                                   "Qtd de Horas Trabalhadas: " + qtdHoras + "H" + 
                                   "Valor: " + recepcionista(qtdHoras));
            }
            else{
                
                System.out.println("Função invalida ");
            
            }
        }
        System.out.println("================== Programa encerrado ==================");
    }
}
