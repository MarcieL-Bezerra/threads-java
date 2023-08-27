# Código completo do curso **Threads I: Programação paralela em Java**.

 Curso: https://cursos.alura.com.br/course/threads-java-1

### Faça esse curso de Java e:
+ Saiba como criar processos em paralelo
+ Controle a ordem de execução das suas threads
+ Conheça os problemas de acesso concorrente
+ Acesse variáveis compartilhadas
+ Espere a execução de outra thread
+ Notifique outra thread

### O definição de Threads:
+ Threads permitem que um programa opere com mais eficiência, fazendo várias coisas ao mesmo tempo. Threads podem ser usados ​​para executar tarefas complicadas em segundo plano sem interromper o programa principal. 
+ _Fonte:_ https://www.w3schools.com/java/java_threads.asp

### Exemplo de Threads:
#### Ele pode ser criado estendendo a Threadclasse e substituindo seu run() método:
---
```java
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  } 
}
```

### Foi Adicionado ao projeto *Java Lambda Expressions* :
+  Uma expressão lambda é um pequeno bloco de código que recebe parâmetros e retorna um valor. As expressões lambda são semelhantes aos métodos, mas não precisam de nome e podem ser implementadas diretamente no corpo de um método. 
+ _Fonte:_ https://www.w3schools.com/java/java_threads.asp

### Exemplo de Lambda Expressions:
#### Use a interface do Java Consumer para armazenar uma expressão lambda em uma variável:
---
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
```
