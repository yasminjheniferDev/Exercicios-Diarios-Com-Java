import java.util.Locale;
import java.util.Scanner;

public class MaiusculasTotLetras {
    public static void main(String[] args) {

        //Programa de Manipulação de dados e tipos Primitivos.
        //Programa que imprime o nome completo em letras maiúsculas e o total de letras.

        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome= entrada.nextLine();
        System.out.println("Digite o seu sobrenome:");
        String sobrenome= entrada.nextLine();

        String nomecompleto= nome + " " + sobrenome;
        System.out.println(nomecompleto.toUpperCase() + ".");
        System.out.println(nomecompleto.length() + " letras.");

        entrada.close();
    }
}
