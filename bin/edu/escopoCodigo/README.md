# Escopo

## O escopo em Java se refere à parte do código onde uma determinada variável é acessível ou visível. É importante entender o escopo das variáveis para evitar erros de referência e garantir que o código seja organizado de maneira clara e eficiente. 

- Escopo de Variáveis Locais:Variáveis locais são declaradas dentro de um bloco de código, como um método, um loop ou um bloco condicional. O escopo dessas variáveis é limitado ao bloco em que são declaradas.

```
public void exemplo() {
    int x = 10; // x está visível apenas dentro deste método
    System.out.println(x);
}
```

- Escopo de Parâmetros de Método:Os parâmetros de um método também têm escopo local e estão disponíveis apenas dentro do corpo do método em que são declarados.

```
public void exemplo(int y) {
    // y está visível apenas dentro deste método
    System.out.println(y);
}

```

- Escopo de Variáveis de Instância:Variáveis de instância são declaradas em uma classe, mas fora de qualquer método. Elas são acessíveis a todos os métodos da classe e existem enquanto o objeto que as contém existir.

```
public class Exemplo {
    int z; // Variável de instância
    
    public void metodo() {
        // z é acessível dentro deste método
        System.out.println(z);
    }
}
```

- Escopo de Variáveis de Bloco:Em Java, blocos de código dentro de um método, como loops for, while, e blocos condicionais if, podem ter seu próprio escopo para variáveis locais declaradas dentro deles.

```
public void exemplo() {
    if (true) {
        int w = 20; // w está visível apenas dentro deste bloco if
        System.out.println(w);
    }
}
```
- Escopo de Variáveis de Bloco Aninhado:Se um bloco estiver aninhado dentro de outro bloco, as variáveis declaradas no bloco externo ainda serão acessíveis dentro do bloco interno.

```
public void exemplo() {
    int a = 30; // Variável acessível em todo o método

    if (true) {
        // Variável a ainda é acessível dentro deste bloco
        System.out.println(a);
    }
}
```
## Entender o escopo das variáveis é fundamental para escrever código Java claro e sem erros. Ele ajuda a evitar conflitos de nomes, melhora a legibilidade do código e ajuda na depuração de problemas relacionados à visibilidade das variáveis.


```
public class Conta{
    //variavel da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        //variável local do método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //disponivel em toda classe, variavel saldo
        System.out.println(saldo);

        //somente o método sacar conhece essa variável
        System.out.println()
    }
}
```