import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linhas, colunas, soma = 0;

        System.out.print("Digite o número de linhas da matriz: ");
        linhas = input.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "] da matriz: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}
