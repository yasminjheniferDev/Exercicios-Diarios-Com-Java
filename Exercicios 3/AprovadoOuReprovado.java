import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {

        //Programa que utiliza Estrutura Condicional If e Else.
        //Programa que lê a nota do usuário e imprime que se ele tirou a nota maior ou igual a 7 foi aprovado, e que a nota menor que 7 ele foi reprovado.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua nota na prova:");
        double nota= entrada.nextDouble();
        if(nota>=7){
            System.out.println("Muito bem!Você foi aprovado.");
        } else{
            System.out.println("Não foi dessa vez!Você foi reprovado.");

        }
    }
}
