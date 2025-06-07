import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota da prova 1: ");
        double prova1 = sc.nextDouble();
        System.out.print("Nota da prova 2: ");
        double prova2 = sc.nextDouble();
        System.out.print("Nota do trabalho: ");
        double trabalho = sc.nextDouble();

        double media = (prova1 + prova2 + trabalho) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
