import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
// Após toda a entrada ter sido realizada, leia o valor de um reajuste. Em seguida exiba todos os salários já reajustados.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> salarios = new ArrayList<>();
        List<Double> salariosReajustados = new ArrayList<>();
        List<Double> valoresReajuste = new ArrayList<>();

        System.out.println("* Digite -1 quanto desejar parar de inserir salários *\n");
        int count = 0;
        boolean repeat = true;
        while (repeat){
            count++;
            System.out.printf("Digite o valor do salário da pessoa %d: ", count);
            double salario = sc.nextDouble();
            if (salario != -1){
                salarios.add(salario);
            } else {
                repeat = false;
            }
        }
        System.out.print("\nDigite a porcentagem do reajuste: ");
        double reajuste = sc.nextDouble();
        double taxaReajuste = reajuste/100;

        for (double salario:salarios) {
            double valorReajuste = (salario*taxaReajuste);
            double novoSalario = valorReajuste + salario;
            salariosReajustados.add(novoSalario);
            valoresReajuste.add(valorReajuste);

        }
        System.out.println("\n--------------------TABELA DE VALORES----------------------");
        System.out.println("| Salário anterior | Salário Reajustado | Valor reajustado |");
        for (int i = 0; i<salarios.size(); i++){
            System.out.printf("|   R$%10.2f   |    R$%10.2f    |   R$%10.2f   | %n",
                    salarios.get(i), salariosReajustados.get(i), valoresReajuste.get(i));
        }


    }
}
