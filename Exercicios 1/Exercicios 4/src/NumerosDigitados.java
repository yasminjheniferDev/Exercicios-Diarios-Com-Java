import java.util.Scanner;

public class NumerosDigitados {
    public static void main(String[] args) {

        //Programa que utiliza o array e laço for.
        //Programa que lê os números digitados pelo usuário e imprime todos eles em ordem na mesma linha.

        Scanner entrada = new Scanner(System.in);
        int[] n = new int[5];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite um número:");
            n[i] = entrada.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");

        }
    }
}
