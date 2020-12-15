# Questão 01
 - Não pois o Java irá atribuir um valor inteiro para a variável;
---
# Questão 02
- Erro pois a classe hotel não solicitou nenhum parametro e sim `adicionarReserva()`;
---
# Questão 03
- A saída de 0, pois como o atributo da Classe Teste não foi inicializado o Java automaticamente atribui um valor a ele;
---
# Questão 04
- Este é um método para acumular valor;
```Java
void x(double valor) {
    valor = valor + valor;
}
```
- Escrito dessa forma o método fica confuso de se ler pois o atributo e o parametro tem o mesmo nome, isso pode ser reescrito da seguinte forma:
```Java
void x(double valor) {
    this.valor = valor + valor;
}
```
- agora com o *this* fica facilmente reconhecivel que o primeiro *valor* se refere ao atributo da classe e o segundo *valor* ao parametro.
---
# Questão 05
- Falta declarar se a classe *Radio()* é publica/privada/protegida, colocar o tipo de retorno, e o retorno;
---
# Questão 06
- a) Os dois prints saem com o valor 90. 
- b) O Objeto *c1* estava no endereço Conta@10 e o objeto *c2* no endereço Conta@13, ao fazer *c1 = c2*, *c1* passou a apontar para o endereço *Conta@13*.
---
# Questão 07
---
# Questão 08
---
# Questão 09
---
