import java.util.Scanner;

public class PrimeiroDivisivelPeloSegundo {
    public static void main(String[] args) {

        //Programa que utiliza os Operadores Relacionais e Estruturas Condicionais.
        //Programa que imprimi se o primeiro número é divisível pelo segundo.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1= entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int n2= entrada.nextInt();

        if(n1 % n2 == 0){
            System.out.println("Divisível.");
        }else{
            System.out.println("Não divisível.");
        }

    }
}
