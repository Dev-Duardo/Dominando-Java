package exercicios.praticacomjava;

import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        
        // System.out.println("1 - Depositar\n2 - Sacar\n3 - Consultar Saldo\n0 - Encerrar");  
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        double saldo = 0; 
        Boolean encerrar = false;
        
        

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (!encerrar) { 
          
         
          
          int opcao = scanner.nextInt(); 
            //TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
          switch (opcao) {
            case 1:
               
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Saldo atual: " + saldo);
                break;

            case 2:
                
                Double sacar = scanner.nextDouble();
                if(sacar > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= sacar;
                    System.out.println("Saldo atual: " + saldo);
                }
                break;  

            case 3:
                System.out.println("Saldo atual: " + saldo);
                break; 

            case 0:
                System.out.println("Programa encerrado.");
                encerrar = true;
                break;

            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
            default:
            System.out.println("Opção inválida. Tente novamente."); 
            }
        
         
        }
    }
}