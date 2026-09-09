import java.util.Scanner;

public class BaldeEnchendo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);{

            int nivel = 0;
            int l = 0;

            //Condição que funciona enquanto for verdadeira.

            while (nivel < 100) {
                System.out.println("Quanto de agua você vai despejar ?");
                l = entrada.nextInt();
                nivel+=l;
                System.out.println("Nível atual do balde: " + nivel);

            }
            System.out.println("O balde transbordou, capacidade máxima = K" + nivel + " litros.");
        }
    }
}
