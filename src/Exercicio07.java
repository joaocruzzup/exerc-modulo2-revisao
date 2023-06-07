import java.util.Scanner;

// Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // cabeçalho
        System.out.println("----------------------------------");
        System.out.println("Boas vindas a repetidora de nomes!");
        System.out.println("----------------------------------\n");

        System.out.println("Digite o seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Digite um número positivo: ");
        int numero = sc.nextInt();

        while (numero <=0){
            System.out.println("Digite um número positivo: ");
            numero = sc.nextInt();
        }

        for (int i = 0; i < numero; i++){
            System.out.printf("%s %n", nomeUsuario);
        }
    }
}
