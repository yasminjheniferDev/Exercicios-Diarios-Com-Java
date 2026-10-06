import java.util.Scanner;

public class MeuPerfil {
    public static void main(String[] args) {

        //Programa de manipulação de dados e tipos primitivos.
        //Programa que lê o nome, idade, altura e profissão de uma pessoa.
        Scanner entrada =new Scanner(System.in);
        System.out.print("Qual o seu nome:");
        String nome = entrada.nextLine();
        System.out.print("Qual a sua idade:");
        int idade= entrada.nextInt();
        System.out.print("Qual a sua altura:");
        double altura= entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Qual a sua profissão:");
        String profissao= entrada.nextLine();

        System.out.printf("O seu nome é %s,você tem %d anos,a sua altura é %.2f,e  sua profissão é %s.",nome,idade,altura,profissao);



        entrada.close();
    }
}
