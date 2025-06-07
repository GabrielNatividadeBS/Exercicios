import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();


        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        if (soma >= 10) {
            soma += 5;
        } else {
            soma -= 7;
        }


        System.out.println("Resultado final: " + soma);
    }
}
