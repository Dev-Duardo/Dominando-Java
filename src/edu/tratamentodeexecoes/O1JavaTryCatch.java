package edu.tratamentodeexecoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class O1JavaTryCatch{
    
    public static void main (String[] args) {
        try {
            // Cria um objeto Scanner para ler a entrada do usuário do sistema de entrada padrão (teclado)
            // e configura o Scanner para usar o padrão de ponto decimal americano (Locale.US)
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            // Solicita ao usuário que digite seu nome
            System.out.println("Digite o seu nome: ");
            // Lê a entrada do usuário como uma string e a armazena na variável 'nome'
            String nome = scanner.next();

            // Solicita ao usuário que digite seu sobrenome
            System.out.println("Digite o seu sobrenome: ");
            // Lê a entrada do usuário como uma string e a armazena na variável 'sobrenome'
            String sobrenome = scanner.next();

            // Solicita ao usuário que digite sua idade
            System.out.println("Digite a sua idade: ");
            // Lê a entrada do usuário como um número inteiro e a armazena na variável 'idade'
            int idade = scanner.nextInt();

            // Solicita ao usuário que digite sua altura
            System.out.println("Digite a sua altura: ");
            // Lê a entrada do usuário como um número de ponto flutuante (double) e a armazena na variável 'altura'
            double altura = scanner.nextDouble();

            // Exibe uma mensagem de saudação com as informações fornecidas pelo usuário
            System.out.println("Olá, me chamo " + nome + " " + sobrenome + "\nTenho " + idade + " anos" + "\nMinha altura é " + altura + "M");

            // Fecha o objeto Scanner para liberar os recursos
            scanner.close();
        } 
        catch (InputMismatchException e){
            System.out.println("O campo idade e altura apenas números");
            //System.err.println("O campo idade e altura apenas números");
        }
    }
}
