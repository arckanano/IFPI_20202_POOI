# Respostas de questões dissertativas
## Q1 - Os comandos corretos são:
- javac Avaliacao.java < Compila o programa;
- java Avaliacao < Executa o programa;
---
## Q2:
- Ocorre erro de compilação, onde é informado que a variável *contador* não foi inicializada, e por ser atribuida como *int* é necessário inicializar com qualquer valor do tipo inteiro.
- Um exemplo correto seria: *int contador=0;*
---
## Q3:
- O operador *&& (and / E)* avalia se os dois lados da condição são verdadeiros;
- Como o primeiro lado é *falso*, a segunda condição não é avaliada, dessa forma o incremento em *b* não ocorre e é impresso o resultado de *a-b*;
- Caso *a* fosse *verdadeiro* ocorreria o incremento em *b* que passaria a valer *1*;
---
## Q4
- O comando *switch...case* testa todos os casos e imprime o valor em cada caso;
- Normalmente é usado com um *break* no final de cada caso;
- Sem o *break* todos os casos são testados;
---
## Q5
```Java
// Código da questão
public class Exemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        System.out.println("Soma: " + a + b);
    }
}

// Código corrigido
public class Exemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int soma = a +b;
        System.out.println("Soma: " + soma);
    }
}

```
---
## Q6
```Java
public class Saudacao {
    public static void main(String[] args) {
        System.out.println("Bem Vindo!");
    }
}
```
---
## Q7
```Java
public class Saudacao {
    String texto;
    String destinatario;

    // Método
    String obterSaudacao() {
        System.out.println(texto + " " + destinatario);
    }
}
```
---
## Q8
- Classe criada:
```Java
// Classe criada
public class Saudacao {
    String texto;
    String destinatario;

    // Método
    public String obterSaudacao() {
        String saida = texto + " " + destinatario;
        return saida;
    }
}
```
- Classe de testes
```Java
public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao s = new Saudacao();
        s.texto = "Bom dia";
        s.destinatario = "Joao";

        System.out.println(s.obterSaudacao());
    }    
}
```
---
## Q9
- O modelo abordado na questão 8 é o mais estruturado, mais voltado a Orientação a Objeto e que proporciona maior portabilidade e modularização. Também é o mais burocrático pois há a necessidade de criar mais arquivos, e 'digitar mais'.
---
## Q10
---
## Q11
---
## Q12
---
## Q13
---
## Q14
---
## Q15
---


