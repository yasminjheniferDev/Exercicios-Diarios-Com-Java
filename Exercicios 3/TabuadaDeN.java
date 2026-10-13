import java.util.Scanner;

public class TabuadaDeN {
    public static void main(String[] args) {

        //Programa que utiliza o laço for.
        //Programa que lê o número que o usuário escolheu e imprime a tabuada de adição, subtração, multiplicação e divisão.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Me mostre a tabuada de :");
        int n = entrada.nextInt();

        System.out.println("Tabuada de Adição de " + n + ":");
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(n + " + " + contador + " = " + (n + contador));
        }
        System.out.println("Tabuada de Subtração de " + n + ":");

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(n + " - " + contador + " = " + (n - contador));
        }
        System.out.println("Tabuada de Multiplicação de " + n + ":");
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(n + " x " + contador + " = " + (n * contador));
        }
        System.out.println("Tabuada de Divisão de " + n + ":");
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(n + " % " + contador + " = " + (n % contador));

        }
    }
}
