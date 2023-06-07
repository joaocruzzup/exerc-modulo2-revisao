import java.util.Scanner;

// Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações
// e a média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento,
// usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
// A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
//Média de aproveitamento Conceito
//>= 90 A
//>= 75 e < 90 B
//>= 60 e < 75 C
//>= 40 e < 60 D
//< 40 E
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];

        // cabeçalho
        System.out.println("-----------------------------------------------------");
        System.out.println("Boas vindas a calculadora de média de aproveitamento!");
        System.out.println("-----------------------------------------------------\n");

        for (int i = 0; i<notas.length; i++){
            System.out.printf("Digite a %dª nota (de 0 a 100): ", (i+1));
            notas[i] = sc.nextDouble();

            while (notas[i] < 0 || notas[i] >100){
                System.out.println("Nota inválida! ");
                System.out.printf("Digite a %dª nota (de 0 a 100): ", (i+1));
                notas[i] = sc.nextDouble();
            }
        }

        System.out.println("Digite a média dos exercícios (de 0 a 100): ");
        double mediaME = sc.nextDouble();
        while (mediaME < 0 || mediaME >100){
            System.out.println("Média inválida! ");
            System.out.println("Digite a média dos exercícios: (de 0 a 100)");
            mediaME = sc.nextDouble();
        }

        double mediaMA = (notas[0] + (notas[1]*2) + (notas[2] *3) + mediaME)/7;

        if (mediaMA >= 90){
            System.out.printf("Média de aproveitamento: %.2f %nConceito: A%n* Parabéns você foi aprovado! :D *", mediaMA);
        } else if (mediaMA >= 75) {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: B%n* Parabéns você foi aprovado! :D *", mediaMA);
        } else if (mediaMA >=60) {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: C%n* Parabéns você foi aprovado! :D *", mediaMA);
        } else if (mediaMA >=40) {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: D%n* Infelizmente você foi reprovado :( *", mediaMA);
        } else {
            System.out.printf("Média de aproveitamento: %.2f %nConceito: E%n* Infelizmente você foi reprovado :( *", mediaMA);
        }
    }
}
