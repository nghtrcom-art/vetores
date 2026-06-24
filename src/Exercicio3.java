import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Instruções ao usuário e leitura da variável.
        System.out.println("Digite o seu nome para invertê-lo:");
        String nome = sc.nextLine();

        //Vetor que armazenará as letras do nome do usuário.
        char[] letras = new char[nome.length()];

        //Loop para separação das letras utilizando o método "charAt()" e armazená-las no vetor.
        for (int i = 0; i < nome.length(); i++) {
            letras[i] = nome.charAt(i);
        }

        //Variável auxiliar que armazenará os valores momentâneos dos índices.
        char aux;

        //Loop que irá trocar os caracters de ídices.
        for (int i = 0; i < letras.length / 2; i++) {

            aux = letras[i];
            letras[i] = letras[letras.length - 1 - i];
            letras[letras.length - 1 - i] = aux;
        }

        //Exibe na tela o nome invertido do usuário.
        System.out.print("Nome invertido:\n ");

        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
    }
}

