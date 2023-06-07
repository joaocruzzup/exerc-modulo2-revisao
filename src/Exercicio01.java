// Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
// caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C
// e mostrar seu conteúdo na tela.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o primeiro valor: ");
        int valorA = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int valorB = sc.nextInt();

        // Lógica do Calculo
        int valorC = (valorA == valorB) ? (valorA + valorB) : (valorA * valorB);

        // Saida de dados
        System.out.printf("A variável C é igual a: %d", valorC);

    }
}
