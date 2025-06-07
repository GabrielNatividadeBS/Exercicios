import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS (ex: 11 para 11%): ");
        double descontoINSS = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double desconto = salarioBruto * (descontoINSS / 100);
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
