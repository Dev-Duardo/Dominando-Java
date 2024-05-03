package edu.operadores;


public class Operadores1AritimeticoAtribuicaoComparacao {
    public static void main (String[] args) {
        
        //Operadores Aritméticos:
        int a = 10;
        int b = 5;

        int soma = a + b; // soma = 10 + 5 = 15
        int subtracao = a - b; // subtracao = 10 - 5 = 5
        int multiplicacao = a * b; // multiplicacao = 10 * 5 = 50
        int divisao = a / b; // divisao = 10 / 5 = 2
        int resto = a % b; // resto = 10 % 5 = 0


        //Operadores de Atribuição:
        int x = 10;
        x += 5; // x = 10 + 5 = 15
        x -= 3; // x = 15 - 3 = 12
        x *= 2; // x = 12 * 2 = 24
        x /= 4; // x = 24 / 4 = 6


        //Operadores de Comparação (Relacionais):
        int c = 10;
        int d = 5;

        boolean igual = (c == d); // igual = false
        boolean diferente = (c != d); // diferente = true
        boolean maior = (c > d); // maior = true
        boolean menor = (c < d); // menor = false
        boolean maiorOuIgual = (c >= d); // maiorOuIgual = true
        boolean menorOuIgual = (c <= d); // menorOuIgual = false

        

        
    
    }
}
