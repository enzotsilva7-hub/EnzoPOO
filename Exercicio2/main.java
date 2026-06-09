package Exercicio2;

class Produto2 {
    String nome;
    double preco;

    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{nome='" + nome + "', preco=" + preco + "}";
    }
}

public class main {

    public static void main(String[] args) {

        Produto2 p = new Produto2("caneta", 15.50);

        System.out.println(p);
        System.out.println("item: " + p);
    }
}


/* Explicação: com o metodo toString() o java exibe os dados do objeto mostrando o nome e o preço do produto */