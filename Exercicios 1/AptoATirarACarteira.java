import java.util.Scanner;

public class AptoATirarACarteira {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("  DEPARTAMENTO DE TRÂNSITO");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Em que ano você nasceu?");
        int nasc= entrada.nextInt();

        System.out.println("Em que ano estamos?");
        int anoatual= entrada.nextInt();

        int idade= anoatual - nasc;

            System.out.println("-------------STATUS---------------");
        System.out.println("IDADE: " + idade + " ANOS");
        if(idade >=18){
            System.out.println("VOCÊ ESTÁ APTO A TIRAR A CARTEIRA");
            System.out.println("---------------------------------");
        } else{
            System.out.println("VOCÊ ESTÁ INAPTO A TIRAR A CARTEIRA");
            System.out.println("-----------------------------------");
        }

    }
}
