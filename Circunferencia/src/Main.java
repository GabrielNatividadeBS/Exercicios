import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        double raio = sc.nextDouble();
        double area = Math.PI * raio * raio;
        System.out.println("A área da circunferência é: " + area);
    }
}
