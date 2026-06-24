import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args){

        //Inicialização do scanner e variável que armazenará o valor digitado pelo usuário.
        Scanner sc = new Scanner(System.in);
        int tamanhoDoVetor = 0;

        //Instruções ao usuário, leitura do teclado e declaração do vetor.
        System.out.println("Digite a quantidade de índice que terá o vetor:");
        tamanhoDoVetor = sc.nextInt();
        int vetor[] = new int[tamanhoDoVetor];

        //Instruções ao usuário e leitura do vetor
        System.out.println("Agora digite os números que ficaram nesses índices:");
        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = sc.nextInt();
        }

        //Exibe na tela os números digitados pelo usuário sem alteração.
        System.out.println("Os números digitados foram:");
        for (int x = 0; x < vetor.length; x++) {

            System.out.println(vetor[x]);

        }
        //Método criado no programa para realizar as operações
        operacoeComVeotr(vetor);

        for (int y = 0; y < vetor.length; y++) {

            System.out.println(vetor[y]);

        }


    }
    private static void operacoeComVeotr(int[] vetor){
        //Laço para percorrer o veetor
        for (int j = 0; j < vetor.length; j++) {
            //Estrutura de decisão
            if(vetor[j] % 2 == 0){
                //Operação com os números pares e alteração do valor armazenado no índice.
                vetor[j] = vetor[j] * 2;

            } else if (vetor[j] % 2 != 0) {

                //Operação com os números ímpares e alterações do valor armazenado no índice, com o uso do método "casting"
                //para tranformar o valor obtido em um tipo inteiro.
                vetor[j] = (int) Math.pow(vetor[j],2);
            }

        }
    }
}
