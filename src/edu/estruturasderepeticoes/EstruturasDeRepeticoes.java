import java.util.concurrent.ThreadLocalRandom;

public class EstruturasDeRepeticoes {
    public static void main(String[] args) {
        
        String[] alunos = {"Eduardo", "José", "Bernardo", "Bruno"};
        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
        
        // Repetição Simples (for em array)
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("\nRepetição Simples:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }

        // Repetição Composta
        System.out.println("\nRepetição Composta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }


        // Repetição Encadeada
        System.out.println("\nRepetição Encadeada:");
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

        // Operador Ternário
        System.out.println("\nOperador Ternário:");
        int x = 10;
        String result = (x > 5) ? "Maior que 5" : "Menor ou igual a 5";
        System.out.println(result);

        // Switch Case
        System.out.println("\nSwitch Case:");
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day: " + dayName);

        // Break
        System.out.println("\nBreak:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Break - i: " + i);
        }

        // Continue
        System.out.println("\nContinue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Continue - i: " + i);
        }

        // Try-Catch
        System.out.println("\nTry-Catch:");
        try {
            int resultado = 10 / 0; // Tentativa de divisão por zero
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero: " + e.getMessage());
        }

        // Hierarquia de Exceções
        System.out.println("\nHierarquia de Exceções:");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]); // Tentativa de acesso a um índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Acesso a um índice inválido: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }

        // Exceção Customizada
        System.out.println("\nExceção Customizada:");
        try {
            throw new MinhaExcecao("Esta é uma exceção customizada\n");
        } catch (MinhaExcecao e) {
            System.out.println(e.getMessage());
        }

        // Repetição com While
        System.out.println("\nRepetição com While: ");
        int i = 0;
        while (i < 5) {
            System.out.println("While - i: " + i);
            i++;
        }

        
        // Repetição com Do-While
        System.out.println("\nRepetição com DoWhile::");
        int j = 0;
        do {
            System.out.println ("Do-While - j: " + j);
            j++;
        } while (j < 5);



        //valor aleatorio mesada
        System.out.println("\nWhile, if, valor random:");
        double mesada = 50.0;
        int quantidadeDoce = 0;

        //enquanto mesada maior que zero
        while ( mesada  > 0 ) {
            // Miatê vai pegar um doce de valor aleatório.
            double valorDoce = ThreadLocalRandom.current().nextDouble(2,8);

            // Se o valor do doce for maior que a mesada
            if (valorDoce > mesada)
                //O doce vai ser o valor da mesada. No caso aqui é só para não fazer uma outra verificação por causa do valor do último doce, para a mesada não ficar com o valor negativo.
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho" );
            
            mesada -= valorDoce; //mesada = mesada - valorDoce;
            quantidadeDoce++;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Maitê gastou toda a sua mesada comprando " + quantidadeDoce + " doces");
    }

}


// Exceção Customizada
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
