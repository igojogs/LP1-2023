import java.util.Arrays;

public class MostrarTabuleiro {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};


        exibirTabuleiro(tabuleiro);
        imprimirTabuleiro(tabuleiro);
    }

    private static void imprimirTabuleiro(char[][] tabuleiro){
        System.out.println("   0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + tabuleiro[i][j]);
            }
            System.out.println
                    ("|");
            System.out.println("  ---------");
        }
    }

    private static void exibirTabuleiro(char[][] tabuleiro){
        System.out.println("   0  1  2");
        System.out.println("0 " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println("  ---------");
        System.out.println("1 " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println("  ---------");
        System.out.println("2 " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
    }
}
