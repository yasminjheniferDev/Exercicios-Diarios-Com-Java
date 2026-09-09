import java.util.Scanner;

public class DividirNPor2Ate1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);{
            System.out.println("Digite um número: ");
            int n = entrada.nextInt();
            int contador = 0;

            while(n > 1){
                n = n / 2;
                contador++;
            }

            System.out.println("Números de divisões = " + contador);
        }
    }
}
