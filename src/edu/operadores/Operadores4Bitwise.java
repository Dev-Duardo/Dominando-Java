package edu.operadores;
public class Operadores4Bitwise {
    public static void main(String[] args) {
        int a = 5;  // Representação binária: 00000000000000000000000000000101
        int b = 3;  // Representação binária: 00000000000000000000000000000011
        
        // Operador AND Bitwise (&)
        int resultadoAnd = a & b;  // Resultado: 00000000000000000000000000000001 (1 em decimal)
        System.out.println("Operador AND Bitwise (&): " + resultadoAnd);  // Output: 1
        
        // Operador OR Bitwise (|)
        int resultadoOr = a | b;  // Resultado: 00000000000000000000000000000111 (7 em decimal)
        System.out.println("Operador OR Bitwise (|): " + resultadoOr);  // Output: 7
        
        // Operador XOR Bitwise (^)
        int resultadoXor = a ^ b;  // Resultado: 00000000000000000000000000000110 (6 em decimal)
        System.out.println("Operador XOR Bitwise (^): " + resultadoXor);  // Output: 6
        
        // Operador NOT Bitwise (~)
        int resultadoNotA = ~a;  // Resultado: 11111111111111111111111111111010 (-6 em decimal, em complemento de 2)
        int resultadoNotB = ~b;  // Resultado: 11111111111111111111111111111100 (-4 em decimal, em complemento de 2)
        System.out.println("Operador NOT Bitwise (~) para a: " + resultadoNotA);  // Output: -6
        System.out.println("Operador NOT Bitwise (~) para b: " + resultadoNotB);  // Output: -4
        
        // Operador Shift Left (<<) e Shift Right (>>)
        int shiftLeft = a << 1;  // Resultado: 00000000000000000000000000001010 (10 em decimal)
        int shiftRight = a >> 1;  // Resultado: 00000000000000000000000000000010 (2 em decimal)
        System.out.println("Operador Shift Left (<<) para a: " + shiftLeft);  // Output: 10
        System.out.println("Operador Shift Right (>>) para a: " + shiftRight);  // Output: 2
    }
}
