import java.util.Scanner;

import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Em que ano estamos?");
        int ano = entrada.nextInt();

        System.out.println("Em que ano você nasceu?");
        int nascimento = entrada.nextInt();

        int idade = ano - nascimento;

        System.out.print("Em " + ano + " você terá " + idade + " anos " );

        if(idade >= 21) {

            System.out.print(", e você já terá atingido a maioridade.");
        } else {
            System.out.println(". Você ainda não atingiu a maioridade. ");
        }

        entrada.close();
    }
}







































