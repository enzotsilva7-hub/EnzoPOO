package Exercicio5;

class Livro {
    String titulo;
    String isbn;

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
}

public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code", "110-9876543210");
        Livro l2 = new Livro("Clean Code", "123-4567891011");

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));
    }
}

// Explicação: como l1 e l2 são objetos diferentes e equals() não foi sobrescrito os resultados sao false //