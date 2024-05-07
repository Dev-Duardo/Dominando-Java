import java.util.Random;

public class EstruturasDeRepeticoes2 {
    public static void main(String[] main) {
        int contagemTocando = 0;
        System.out.println("Discando...");
        do { 
            System.out.println("Telefone tocando");
            contagemTocando++;

        } while (tocando()); //enquanto método tocando() for verdadeiro.


        System.out.println("Alô !!!");
        System.out.println("Tocou " + contagemTocando + " vezes antes de atender.");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        
        return ! atendeu;
    }

}