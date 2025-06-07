import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade > 18) {
            System.out.println("Pode tirar a carteira de motorista.");
        } else {
            System.out.println("NÃO pode tirar a carteira de motorista.");
        }
    }
}
