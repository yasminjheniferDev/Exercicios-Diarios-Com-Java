import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        //Programa que utiliza Estrutura Condicional If e Else.
        //Programa que lê um número digitado pelo usuário e imprime se o número é par ou impar.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero= entrada.nextInt();

        if(numero % 2 ==0){
            System.out.println("Esse número é par.");
        }else{
            System.out.println("Esse número é impar.");
        }
    }
}
