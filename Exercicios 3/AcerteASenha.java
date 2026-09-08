import java.util.Scanner;

public class AcerteASenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);{
            int senha=0;

            //Condição que repete enquanto for verdadeira. O programa finaliza quando a senha correta for digitada.

            while (senha != 1234) {
                System.out.println("Digite a sua senha :");
                senha = entrada.nextInt();

            }
            System.out.println("Bem-Vindo de Volta!");
        }
    }
}
