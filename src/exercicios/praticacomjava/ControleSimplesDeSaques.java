package exercicios.praticacomjava;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double limiteDiario = scanner.nextDouble();
        
        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (;;) {
            
            // TODO: Solicite ao usuário o valor do saque:
            double saque = scanner.nextDouble();

            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;        
            // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            if (saque <= limiteDiario) {
                    
                limiteDiario -= saque;

            // TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }  

        scanner.close();
    }
}

// Fechamos o Scanner para evitar vazamento de recursos:

