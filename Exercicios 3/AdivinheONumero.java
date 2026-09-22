import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        {


            int chute;
            do {
                System.out.println("Adivinhe o número aleatório entre 1 e 100: ");
                chute = entrada.nextInt();

            } if (chute > 10)
                System.out.println("Muito alto! tente novamente.");
            {else if (chute < 10) {
                System.out.println("Muito alto! tente novamente.");
            }
            while (chute == 10) {
                }
                System.out.println("Parabéns!você acertou, até a próxima!");
            }
        }
    }
}

