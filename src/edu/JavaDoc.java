package edu;

/**
 * Esta classe representa um exemplo de documentação Javadoc.
 * Foi criada por João Silva.
 * @version 1.0
 */
public class JavaDoc {
    
    /**
     * Calcula a área do retângulo.
     * @param comprimento O comprimento do retângulo.
     * @param largura A largura do retângulo.
     * @return A área do retângulo.
     */
    public double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }
    
    /**
     * Calcula o perímetro do retângulo.
     * @param comprimento O comprimento do retângulo.
     * @param largura A largura do retângulo.
     * @return O perímetro do retângulo.
     */
    public double calcularPerimetro(double comprimento, double largura) {
        return 2 * (comprimento + largura);
    }
    
    /**
     * Divide dois números.
     * @param divisor O divisor.
     * @param dividendo O dividendo.
     * @return O resultado da divisão.
     * @throws ArithmeticException Se o divisor for zero.
     */
    public double dividir(double divisor, double dividendo) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
    
    /**
     * Consulta o manual do usuário para obter mais informações sobre como usar este método.
     * @see UsuarioManual#consultar()
     */
    public void consultarManualDoUsuario() {
        // Implementação
    }
}
