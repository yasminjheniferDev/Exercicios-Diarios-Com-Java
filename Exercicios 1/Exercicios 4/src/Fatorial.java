import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        //Programa que utiliza laço for.
        //Programa que lê um número e imprime o fatorial dele, utilizando a estrutura de repetição for. Laço For.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = entrada.nextInt();
        long fatorial = 1;
        for(int i = 1; i <=n;i++){
            fatorial*=i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);

        entrada.close();
    }
}
