import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
// Encerre a execução quando um número negativo for digitado.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        // cabeçalho
        System.out.println("-----------------------------------------------");
        System.out.println("Boas vindas a calculadora de soma de n números!");
        System.out.println("-----------------------------------------------\n");

        int soma = 0;
        boolean condicao = true;
        do{
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            if (numero<0){
                break;
            }
            numeros.add(numero);
            soma+=numero;
        } while (true);

        System.out.println("Os números digitados foram: " + numeros);
        System.out.println("A soma dos números é: " + soma);


    }
}
