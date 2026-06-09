package Exercicio6;

class Livro2 {
    String titulo;
    String isbn;

    public Livro2(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Livro2)) return false;

        Livro2 outro = (Livro2) obj;
        return this.isbn.equals(outro.isbn);
    }
}

public class Main {

    public static void main(String[] args) {

        Livro2 l1 = new Livro2("java1", "133");
        Livro2 l2 = new Livro2("enzo", "222");

        System.out.println(l1.equals(l2));
    }
}
// retorna true porque os ISBNs sao iguais instanceof evita erro com null e o ISBN é usado por ser unico //