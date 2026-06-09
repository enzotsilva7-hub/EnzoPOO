package Exercicio7;

import java.util.Objects;

class livro {
    String titulo;
    String isbn;

    public livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}

public class Main {

    public static void main(String[] args) {

        livro l1 = new livro("A", "123");
        livro l2 = new livro("B", "123");

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
    }
}
