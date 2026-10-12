import java.util.Scanner;

public class PNOuZero {
    public static void main(String[] args) {

        //Programa que utiliza Estrutura Condicional;
        //Programa que lê o número que o usuário digitou e verifica se ele é positivo,negativo ou se é zero.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n= entrada.nextInt();

        if(n > 0){
            System.out.println("Esse número é positivo.");
        } else if( n == 0){
            System.out.println("Esse número é zero.");
        } else {
            System.out.println("Esse número é negativo.");
        }

    }
}
