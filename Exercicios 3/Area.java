import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        //Programa utilizando operadores Aritméticos.
        //Programa que calcula a área do triângulo.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do triangulo:");
        double base= entrada.nextDouble();

        System.out.println("Digite a altura do triangulo:");
        double altura= entrada.nextDouble();

        double area= base * altura /2;
        System.out.println("A área do trângulo é = " + area);

    }
}
