import java.util.Scanner;

//  Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
//  imprimir o resultado desta operação.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // cabeçalho
        System.out.println("---------------------------------------");
        System.out.println("Boas vindas a calculadora diferenciada!");
        System.out.println("---------------------------------------\n");

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int resultado = ((num % 2) == 0) ? num + 5 : num + 8;
        System.out.printf("O resultado da operação é: %d", resultado);

    }
}
