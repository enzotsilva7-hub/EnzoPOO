package Exercicio7;

public package Exercicio7;

import java.util.Objects;

public class livro {
    String titulo;
    String isbn;

    public livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof livro)) return false;

        livro outro = (livro) obj;
        return this.isbn.equals(outro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
} {
    
}
