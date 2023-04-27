import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] contas = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == 0 && j == 0){
                    contas[i][j] = 0;
                }else if(i == 0){
                    System.out.println("Digite o "+ j +"º valor:");
                    contas[i][j] = scanner.nextDouble();
                }else if (j == 0){
                    contas[i][j] = contas[j][i];
                }else if(i == j){
                    contas[i][j] = contas[0][j] * contas[i][0];
                }else {
                    contas[i][j] = contas[0][j] - contas[i][0];
                }
            }
        }

        exibirMatriz(contas);








        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o "+ ( i + 1 ) +"º nome:");
            nomes[i] = scanner.next();
        }

        exibirVetor(nomes);

    }


    public static void exibirVetor(String[] nomes){
        for (String nome : nomes) {
            System.out.printf(nome + " ");
        }

//        for (int i = 0; i < nomes.length; i++) {
//            System.out.printf(nomes[i] + " ");
//        }

//        System.out.printf(nomes[0] + " ");
//        System.out.printf(nomes[1] + " ");
//        System.out.printf(nomes[2]);

    }

    public static void exibirMatriz(double[][] contas){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(contas[i][j] + " ");
            }
            System.out.println();
        }
    }


}
