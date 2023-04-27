public class Teste2 {
    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        mostrarTabuleiro(tabuleiro);
    }

    public static void mostrarTabuleiro(char[][] tab){
        System.out.println(" 0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.printf(i + " ");
            for (int j = 0; j < 3; j++) {
                if(j == 2)
                    System.out.printf(tab[i][j] + "");
                else
                    System.out.printf(tab[i][j] + "|");
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    public static double soma(double x, double y){
        if(x > 2){
            double resultado = x + y;
            return resultado;
        }

        return 0;
    }

}
