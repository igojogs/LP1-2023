import java.util.Scanner;

public class olamundo {
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);

        System.out.println("ola mundo");
        int idade = 90;
        if (idade > 17)
            System.out.println("Adulto");
        else if (idade > 12){
            System.out.println("Adolecente");
        }
        else {
            System.out.printf("Criança");
        }

        String opcao = "3";
        switch (opcao)
        {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            default:
                System.out.println("4");
                break;
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Contador: " + i + " idade: " + idade);
        }

        String nome = "Igor";
        int j = 10;
        while (nome == "Igor"){
            if (j == 10){
                nome = "Outro";
            }
            j++;
        }

        String[] teste = {
                "Igor",
                "Lucas",
                "Bia"
        };

        for (String nome2: teste) {
            if (nome2 == "Igor"){
                System.out.println("Professor: " + nome2);
            }
            else {
                System.out.println("Aluno(a): " + nome2);
            }
        }

        System.out.println("digite");
        //String texto = digita.nextLine();
        //System.out.println("nome:" + texto);

        double novo = 13.456753;

        System.out.printf("%.2f", novo);

        digita.nextdo
    }
}
