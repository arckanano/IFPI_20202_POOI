# Q01
---
# Q02
---
# Q03
---
# Q04
- a) Ocorre o seguinte erro: 
```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        Type mismatch: cannot convert from Bovino to Animal
        The method setProducaoLeite(int) is undefined for the type Animal 
```
-- Para consertar basta criar um *Bovino* do tipo *Bovino*.
---

- b) Ocorre o erro seguinte. A solução é a mesma para a questão anterior.
```
App.java:5: error: incompatible types: Animal cannot be converted to Peixe
        Peixe p = new Animal();
                  ^
1 error
```
---
# Q05
- Falta fazer
---
# Q06
- Pasta
---
# Q07
- Pasta
---
# Q08
- Pasta
---
# Q09
- Pasta
---
# Q10
- TODO
---
# Q11
( V ) em uma instancia b da classe B, se fizermos b instanceof A retorna true
( V ) em uma instancia a da classe A, se fizermos a instanceof B retorna false
( F ) B possui o atributo1 //Pois o mesmo não é visível por B
( V ) Em B o atributo não é visível
( ) Caso o atributo fosse modificado de private para protected, poderia ser
acessado normalmente em B
---
# Q12
- Retorna o valor do método 1 da classe B;
---
# Q13
- Retorna o seguinte erro
```java
The method metodo2() is undefined for the type ClasseA
```
- Indicando que o método não foi defino na classeA;
---
# Q14
- A nova saida seria o retorno do metodo1, da classeA. Pois com o uso do super() a classeB passa a ter acesso ao metodo da ClasseA
---
# Q15
```java

    // Getters and Setters
    public int getAtributo1() {
        return this.atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }
```
---
# Q16
- Apresenta o seguinte erro:
```java
Duplicate method metodo1() in type ClasseB
```
---
# Q17
- Retorna o seguinte erro:
```java
Duplicate method soma(int, int) in type Calculadora
```
- Não há atributosp privados
- Não há construtores
- Não há métodos de acesso
- O nome dos métodos estão duplicados
---
