import java.util.Arrays;

// Crie um vetor capaz de armazenar 50 números inteiros.
// Em seguida faça o seu preenchimento automático com os números de 101 a 150, ou seja, na posição número 0 ponha 101,
// na posição 1 ponha o número 102, e assim sucessivamente. Em seguida exiba os valores deste vetor.
public class Exercicio09 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        // cabeçalho
        System.out.println("------------------------------------------------");
        System.out.println("Boas vindas a impressora de números em um vetor!");
        System.out.println("------------------------------------------------\n");

        int j = 0;
        for (int i = 101; i <=150; i++){
            vetor[j] = i;
            j++;
        }

        System.out.println("Os valores presentes no vetores são: \n");
        for (int num:vetor) {
            System.out.printf("| %d ", num);
            if (num % 20 ==0){
                System.out.println();
            }
        }

    }
}
