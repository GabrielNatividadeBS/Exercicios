import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura do paciente: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 37) {
            System.out.println("Paciente com febre.");
        } else {
            System.out.println("Temperatura normal.");
        }
    }
}
