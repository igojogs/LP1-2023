import java.util.Scanner;

public class Olamundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("O seu nome é " + nome + " e a sua idade é " + idade);

        scanner.close();
    }
}
