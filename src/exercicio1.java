import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {

        //*Para rodar os diferentes trechos de código retire ou acrescente os "/*" e "*/" ao final de cada trecho.


         /*Vetor a ser ordenado
        int vetor[] = new int[]{3, 55, 86, 100, 45, 35};

        ordenaCrescente(vetor);
        ordenaDecresente(vetor);*/

        //Algoritmo que conta as vogais do nome ou frase do usuário.
        Scanner sc = new Scanner(System.in);
        String nomeDoUsuario, vogais = "aeiouAEIOU";
        int contador = 0;

        System.out.println("Dite o seu nome ou uma frase para sabermos quantas vogais a:\n");
        nomeDoUsuario = sc.nextLine();

        for (int i = 0; i < nomeDoUsuario.length(); i++) {

            char letra = nomeDoUsuario.charAt(i);
            if (vogais.indexOf(letra) != -1) {
                contador++;
            }
        }
        System.out.println("Aquantidade de vogais é: " + contador);



    }
    private static void ordenaCrescente(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {

                if (vetor[j] > vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }

            }

        }
        System.out.println("\nVetor em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void ordenaDecresente(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {

                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }

            }

        }
        System.out.println("\nVetor em ordem decrescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}