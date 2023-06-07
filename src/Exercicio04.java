import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Leia a idade de 20 pessoas e exiba a média das idades.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for (int i =0; i<20; i++){
            System.out.printf("Digite a idade da %dª pessoa: ", (i+1));
            soma += sc.nextInt();
        }
        int media = soma/20;
        System.out.printf("%nA média das idades é: %d", media);


    }
}
