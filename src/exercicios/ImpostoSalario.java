package exercicios;
import java.util.Scanner;

public class ImpostoSalario{
    /**
     * @param salario - valor do salario dado em float
     * 
     */
    public static void main(String[] args) {

        Scanner vScanner = new Scanner(System.in);

        System.out.println("Qual o valor do seu salário? ");
        float salario = vScanner.nextFloat();

        System.out.println("Qual o valor dos seus benefícios? ");
        float beneficio = vScanner.nextFloat();
        
        float imposto = 0;
        if (salario >= 0 && salario <= 1100) {
            imposto = 0.05F * salario;
        } else if (salario >= 1100.1 && salario <= 2500) {
            imposto = 0.10F * salario;
        } else {
            imposto = 0.15F * salario;
        } 

        float saida = salario - imposto + beneficio;

        System.out.println("Seu salário após o desconto do imposto (R$ " + String.format("%.2f", imposto) + ") é R$ " + String.format("%.2f", saida));
    }

}