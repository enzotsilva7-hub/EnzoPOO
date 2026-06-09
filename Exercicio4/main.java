package Exercicio4;

public class main {

    public static void main(String[] args) {

        String senhaCorreta = new String("2717");
        String tentativa = "2717";

        if (tentativa == senhaCorreta) {
            System.out.println("acesso liberado");
        } else {
            System.out.println("acesso negado");
        }

        if (tentativa.equals(senhaCorreta)) {
            System.out.println("acesso liberado");
        } else {
            System.out.println("acesso negado");
        }
    }
}


// Explicação: == compara referencias dos objetos enquanto equals() compara o conteudo das strings sendo o metodo correto para validar textos //