package edu.tiposvariaveis;

public class TiposVariaveis1 {
    public static void main(String[] args) {
        System.out.println("Tipos Primitivos: São os tipos de dados básicos fornecidos pela linguagem Java. Existem oito tipos primitivos em Java: \n   - byte: Armazena números inteiros de 8 bits, variando de -128 a 127. \n   - short: Armazena números inteiros de 16 bits, variando de -32.768 a 32.767. \n   - int: Armazena números inteiros de 32 bits, variando de -2.147.483.648 a 2.147.483.647. \n   - long: Armazena números inteiros de 64 bits, variando de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807. \n   - float: Armazena números de ponto flutuante de precisão simples de 32 bits. \n   - double: Armazena números de ponto flutuante de precisão dupla de 64 bits. \n   - char: Armazena caracteres Unicode de 16 bits. \n   - boolean: Armazena valores verdadeiro ou falso. \nTipos de Referência: São tipos de dados que referenciam objetos em vez de armazenar valores diretamente. Alguns exemplos incluem: \n   - String: Uma sequência de caracteres. \n   - Arrays: Uma coleção de elementos do mesmo tipo. \n   - Objetos definidos pelo usuário: Classes que você cria em seu programa. \nTipos de Dados Especiais: \n   - void: Utilizado em métodos para indicar que não há valor de retorno. \n   - null: É uma palavra-chave que pode ser atribuída a variáveis de referência para indicar que elas não estão apontando para nenhum objeto.");
        // Tipos primitivos
        byte idadeByte = 25;
        short idadeShort = 30;
        int idadeInt = 35;
        long idadeLong = 40L;
        float alturaFloat = 1.75f;
        double alturaDouble = 1.75;
        double salario = 2.500;
        double salario2 = 2500;
        char generoChar = 'M';
        boolean estaTrabalhandoBoolean = true;
        
        // Tipos de referência
        String nomeString = "João";
        int[] numerosArray = {1, 2, 3, 4, 5};
        
        // Impressão das variáveis
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("Idade (short): " + idadeShort);
        System.out.println("Idade (int): " + idadeInt);
        System.out.println("Idade (long): " + idadeLong);
        System.out.println("Altura (float): " + alturaFloat);
        System.out.println("Altura (double): " + alturaDouble);
        System.out.println("Salário1 (double)" + salario);
        System.out.println("Salário2 (double)" + salario2 + " obs: convenção americana, não usar ponto para definir centenas");
        System.out.println("Gênero (char): " + generoChar);
        System.out.println("Está trabalhando? (boolean): " + estaTrabalhandoBoolean);
        System.out.println("Nome (String): " + nomeString);
        System.out.print("Números (array): ");
        for (int numero : numerosArray) {
            System.out.print(numero + " ");
        }

    }

}
