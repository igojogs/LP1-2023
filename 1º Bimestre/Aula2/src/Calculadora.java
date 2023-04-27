import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.println("Calculadora simples\n");
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = input.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}

