import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc > 30) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você não está obeso.");
        }
    }
}
