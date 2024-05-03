# 'Declaração de Métodos'

## Um método em Java é declarado usando a seguinte sintaxe

'''
modificador tipoDeRetorno nomeDoMetodo(listaDeParametros) {
    // Corpo do método
}
'''

- modificador: Pode ser public, private, protected ou default (não especificado).
- tipoDeRetorno: O tipo de dado que o método retorna. Pode ser um tipo primitivo, um tipo de objeto ou void se o método não retornar nenhum valor.
- nomeDoMetodo: O nome do método, seguindo as convenções de nomenclatura.
- listaDeParametros: Os parâmetros que o método pode receber, separados por vírgula. Eles são opcionais e podem ser de qualquer tipo de dado.

## Convenções de Nomenclatura

### As convenções de nomenclatura são importantes para garantir a legibilidade do código. Aqui estão algumas convenções comumente seguidas

- CamelCase: O nome de um método deve começar com uma letra minúscula e usar CamelCase para palavras subsequentes. Por exemplo: calcularMedia, imprimirRelatorio.
- Verbos: Os nomes de métodos devem ser verbos que descrevam a ação realizada pelo método. Isso ajuda a entender o propósito do método apenas olhando para o seu nome.
- Clareza: Os nomes de métodos devem ser claros e descritivos, evitando abreviações desnecessárias e siglas obscuras.
- Convenções JavaBeans: Para métodos que são getters e setters de propriedades de classe, use a convenção JavaBeans. Por exemplo: getNome, setNome.
- Boas Práticas:Além das convenções de nomenclatura, existem algumas boas práticas que devem ser seguidas ao escrever métodos em Java:
- Coerência: Mantenha a coerência no estilo e na estrutura dos métodos em todo o código.
- Simplicidade: Um método deve fazer apenas uma coisa e fazer bem. Evite métodos muito longos ou complexos.
- Documentação: Inclua comentários de documentação (Javadoc) para descrever o propósito e o comportamento do método.
- Reusabilidade: Procure reutilizar métodos existentes em vez de reescrever código semelhante.
- Testabilidade: Escreva métodos que sejam fáceis de testar, evitando dependências externas excessivas e efeitos colaterais não controlados.

Seguir essas convenções e boas práticas ao escrever métodos em Java não apenas torna o código mais legível e compreensível, mas também facilita a manutenção e colaboração no desenvolvimento de software.
