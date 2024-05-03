package edu.operadores;
public class Operadores3IncrementoDecremento { 
    public static void main(String[] args) {
        //Operadores de Incremento(++): usado para aumentar o valor de uma variável por uma unidade, pode ser usado de duas maneiras: pré-incremento e pós-incremento.
        //Pré-incremento: o valor da variável é incrementado antes de ser utilizado em qualquer expressão.
        int y = 5;
        int resultado = ++y; // Aqui, y é incrementado em 1 e, em seguida, o valor de y é usado na expressão
        System.out.println("Resultado: " + resultado); // Output: 6
        System.out.println("Valor de y: " + y); // Output: 6
        
        //Pós-incremento: No pós-incremento, o valor da variável é incrementado após ser utilizado na expressão.
        int z = 5;
        int resultado2 = z++; // Aqui, o valor de z é usado na expressão e, em seguida, z é incrementado em 1
        System.out.println("Resultado: " + resultado2); // Output: 5
        System.out.println("Valor de x: " + z); // Output: 6

        //Operador de Decremento (--): usado para diminuir o valor de uma variável por uma unidade, pode ser usado de duas maneiras: pré-decremento e pós-decremento.
        //Pré-decremento: No pré-decremento, o valor da variável é decrementado antes de ser utilizado em qualquer expressão.
        int k = 5;
        int resultado3 = --k; // Aqui, k é decrementado em 1 e, em seguida, o valor de k é usado na expressão.
        System.out.println("Resultado: " + resultado3); // Output: 4
        System.out.println("Valor de k: " + k); // Output: 4

        //Pós-decremento: No pós-decremento, o valor da variável é decrementado após ser utilizado na expressão.
        int l = 5;
        int resultado4 = l--; // Aqui, o valor de l é usado na expressão e, em seguida, l é decrementado em 1
        System.out.println("Resultado: " + resultado4); // Output: 5
        System.out.println("Valor de l: " + l); // Output: 4

    }
}
