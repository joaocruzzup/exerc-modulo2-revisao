import java.util.Scanner;

// Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações
// e a média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento,
// usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];


        for (int i = 0; i<notas.length; i++){
            System.out.printf("Digite a %dª nota (de 0 a 100): ", (i+1));
            notas[i] = sc.nextDouble();
            while (notas[i] < 0 || notas[i] >100){
                System.out.println("Nota inválida! ");
                System.out.printf("Digite a %dª nota (de 0 a 100): ", (i+1));
                notas[i] = sc.nextDouble();
            }
        }

        System.out.println("Digite a média dos exercícios: (de 0 a 100)");
        double mediaME = sc.nextDouble();

        double mediaMA = (notas[0] + (notas[1]*2) + (notas[2] *3) + mediaME)/7;

        if (mediaMA >= 90){
            System.out.printf("Média de aproveitamento: %.2f %nConceito: A%n* Parabéns você foi aprovado! :D *", mediaMA);
        } else if (mediaMA >= 75) {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: B%n* Parabéns você foi aprovado! :D *", mediaMA);
        } else if (mediaMA >=60) {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: C%n* Parabéns você foi aprovado! :D *", mediaMA);
        } else if (mediaMA >=40) {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: A%n* Infelizmente você foi reprovado :( *", mediaMA);
        } else {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: A%n* Infelizmente você foi reprovado :( *", mediaMA);
        }
    }
}
