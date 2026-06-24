import java.util.Scanner;

public class exercicioUm {
    //Segunda parte do exercício 1

    public static void main(String[] args) {

        //Algoritmo que conta as vogais do nome ou frase do usuário.
        Scanner sc = new Scanner(System.in);
        String vogais = "aeiouAEIOU";
        int contador = 0;

        System.out.println("Dite o seu nome ou uma frase para sabermos quantas vogais a:\n");
        String nomeDoUsuario = sc.nextLine();

        for (int i = 0; i < nomeDoUsuario.length(); i++) {
            char letra = nomeDoUsuario.charAt(i);
            if (vogais.indexOf(letra) != -1) {
                contador++;
            }
        }
        System.out.println("Aquantidade de vogais é: " + contador);
    }

}