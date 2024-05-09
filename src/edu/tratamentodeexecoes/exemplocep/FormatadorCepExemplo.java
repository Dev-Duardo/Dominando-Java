package edu.tratamentodeexecoes.exemplocep;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("24752500");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            System.err.println("O Cep não corresponde!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "24752500";
    }


}
