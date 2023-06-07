import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> listaResultado = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            System.out.printf("Digite o %dª número: ", (i+1));
            numeros.add(sc.nextInt());
        }

        for (int numero:numeros) {
            if (numero >=0 && numero<=100){
                listaResultado.add(numero);
            }
        }

        int n = listaResultado.size();
        System.out.printf("Dos números digitados, %d números estão entre 0 e 100 %n", n);
        System.out.println("São eles: " + listaResultado);
    }
}
