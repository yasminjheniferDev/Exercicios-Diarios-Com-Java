import java.util.Scanner;

public class NoN0ParaESoma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);{

            int soma = 0;
            int n;

            // Estrutura que repete pelo menos uma vez + condição para continuar ou finalizar o programa.

            do {
                    System.out.println("Digite um número:");
                n = entrada.nextInt();
                soma+=n;

            } while( n !=0);
            System.out.println("Soma total: " + soma);
        }
    }
}