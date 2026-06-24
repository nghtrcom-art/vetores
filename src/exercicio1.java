import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
        //Primeira parte do exercício 1

        //Inicialização do scanner.
        Scanner sc = new Scanner(System.in);

        //Instruções ao usuário.
        System.out.println("Digite a quantidade de índices que terá o vetor:");
        int quantidadeIndices = sc.nextInt();

        //Vetor a ser ordenado
        int vetor[] = new int[quantidadeIndices];

        //Instruções ao usuário.
        System.out.println("Agora digite os valores que estarão nesses índices:");
        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = sc.nextInt();
        }
        System.out.print("Os valores digitados foram:\n");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
        ordenaCrescente(vetor);
        ordenaDecresente(vetor);





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