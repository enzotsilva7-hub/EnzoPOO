package Exercicio8;

import Exercicio7.livro;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<livro> biblioteca = new HashSet<>();

        livro l1 = new livro("enzo", "222");
        livro l2 = new livro("Visao", "132");

        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println(biblioteca.size());
    }
}