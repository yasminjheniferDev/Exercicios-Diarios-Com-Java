import java.util.Scanner;

public class VelocidadeCarro {
    public static void main(String[] args) {

        //Programa que utiliza estrutura condicional.
        //Programa que imprime se a velocidade está permitida, se estiver entre 90km/h.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a velocidade do carro:");
        int velocidade = entrada.nextInt();

        if (velocidade <= 90) {
            System.out.println("Ótimo!Você está dentro da velocidade permitida.");
        } else {
            System.out.println("Reduza a velocidade!");
        }
    }
}
