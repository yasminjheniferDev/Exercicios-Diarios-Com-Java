import java.util.Scanner;

public class NovoSal {
    public static void main(String[] args) {

        //Programa que utiliza Operadores Aritméticos.
        //Programa que imprime um salário com reajuste de +12%.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário atual:");
        int salatual = entrada.nextInt();

        int novosal= salatual + (salatual * 12/100);

        System.out.println("O seu salário teve um reajuste de +12%.");
        System.out.println("O seu novo salário é = " + novosal + ".");



        entrada.close();
    }
}
