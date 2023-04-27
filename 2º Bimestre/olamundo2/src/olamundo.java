import java.util.Scanner;

public class olamundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("olámundo ");
        System.out.println("olamundo");

        int idade = 25;

        System.out.println("Idade: " + idade + " anos");

        if (idade >= 18){
            System.out.println("maior de idade");
        }
        else {
            System.out.println("menor de idade");
        }

        int idade2 = 90;

        if (idade2 >= 18){
            System.out.println("adulto");
        }
        else if (idade2 >= 12){
            System.out.println("adolecente");
        }
        else {
            System.out.println("criança");
        }

        int opcao = 6;

        switch (opcao){
            case 1:
                System.out.println("opção 1");
                break;
            case 2:
                System.out.println("opção 2");
                break;
            case 3:
                System.out.println("opção 3");
                break;
            default:
                System.out.println("erro");
                break;
        }

        String nomet = "Igor";

        switch (nomet){
            case "Igor":
                System.out.println("Professor");
                break;
            case "Bianca":
                System.out.println("Aluna");
                break;
            default:
                System.out.println("Não existe");
                break;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("Contador: " + j);
            j++;
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Contador: " + i);
        }

        String[] nomes = {
                "Igor",
                "Bianca",
                "Joana"
        };

        System.out.println("Professor: " + nomes[0]);

        if (nomes[0] == "Igor"){
            System.out.println("Professor: " + nomes[0]);
        }else {
            System.out.println("Aluno(a): " + nomes[0]);
        }

        for (String nome : nomes) {
            if (nome == "Igor"){
                System.out.println("Professor: " + nome);
            }else {
                System.out.println("Aluno(a): " + nome);
            }
        }

        String texto = scanner.nextLine();
        System.out.println("Você digitou: " + texto);


    }
}
