import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a distância até a fazenda (km): ");
        double distancia = sc.nextDouble();
        System.out.print("Informe o preço do litro da gasolina: ");
        double precoLitro = sc.nextDouble();

        double litrosNecessarios = distancia / 12;
        double custo = litrosNecessarios * precoLitro;

        System.out.println("Litros: " + litrosNecessarios);
        System.out.println("Custo: R$ " + custo);
    }
}