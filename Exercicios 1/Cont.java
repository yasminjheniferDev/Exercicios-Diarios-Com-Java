import java.util.Scanner;

public class Cont {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = entrada.nextInt();
        while (n <= 100) {
            System.out.println(n);
            n++;
        }
        System.out.println("Pronto, contei até 100 para você. De nada!");
    }
}
