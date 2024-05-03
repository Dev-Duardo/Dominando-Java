package edu.operadores;
public class Operadores5Ternario {
    public static void main(String[] args) {
        int idade = 18;
    //  tipo nome_variavel = (condição) ? " condinção verdadeira" : "condição se falsa";
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade"; // status = "Maior de idade"
        System.out.println(status);
    }
}
