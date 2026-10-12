import java.util.Scanner;

public class MaiorOuMenorNumero {
    public static void main(String[] args) {

        //Programa que utiliza Estrutura Condicional If e Ilse If.
        //Programa que lê a idade do usuário e imprime se ele é maior ou menor de idade.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade= entrada.nextInt();

        if(idade >= 18){
            System.out.println("Parabéns!Você é maior de idade.");
        } else{
            System.out.println("Que pena!Você ainda é menor de idade.");
        }
    }
}
