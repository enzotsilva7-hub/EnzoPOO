/* Explicação: sem o método toString() o java exibe apenas o nome da classe e um codigo de identificação do objeto */

package Exercicio1;

class Produto {
    String nome;
    double preco;
}

public class main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Caneta";
        p1.preco = 10.50;

        Produto p2 = new Produto();
        p2.nome = "Caderno";
        p2.preco = 95.00;

        System.out.println(p1);
        System.out.println(p2);
    }
}