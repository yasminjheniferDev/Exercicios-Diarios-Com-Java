import java.util.Scanner;

public class AprovadoOuReprovado {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua primeira nota?");
        double nota1= entrada.nextDouble();
        System.out.println("Qual a sua segunda nota?");
        double nota2= entrada.nextDouble();

        double media= ( nota1 + nota2 ) / 2;
        System.out.printf(" Média= %.1f.%n ", media);

        if(media >= 7){
            System.out.println("Aluno Aprovado.");
        } else {
            System.out.println("Aluno Reprovado.");
        }

    }
}
