public class Teste {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        mostrarTabuleiro(tabuleiro);

        tabuleiro[0][0] = 'X';

        mostrarTabuleiro(tabuleiro);
    }

    public static void mostrarTabuleiro(char[][] tab){
        System.out.println("  0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.printf("0 ");
            for (int j = 0; j < 3; j++) {
                System.out.printf(tab[i][j] + " ");
                if (j != 2){
                    System.out.printf("|");
                }
            }
            System.out.println("");
            if (i != 2){ System.out.println("------------");}
        }
    }

    public static int soma(int valor1, int valor2){
        int resultado = valor1 + valor2;
        return resultado;
    }

}
