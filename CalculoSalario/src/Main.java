import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horas = sc.nextInt();
        double salario = horas * 20;
        System.out.println("Salário: R$ " + salario);
    }
}