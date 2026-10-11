import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        //Programa que utiliza estrutura condicional e o Random(gera números aleatórios).
        //Programa que simula e imprime o jogo pedra, papel e tesoura, interagindo com o usuário.

        System.out.println("------------------------");
        System.out.println("Jogo Pedra Papel Tesoura");
        System.out.println("-------------------------");
        System.out.println();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pedra,Papel ou Tesoura?");
        String resposta = entrada.nextLine();
        System.out.println("Agora é a minha vez. Lá vai!");

        String[] palavras = {"pedra", "papel", "tesoura"};
        Random sorteio = new Random();
        String ale=palavras[sorteio.nextInt(palavras.length)];

        System.out.println(ale);

        if(resposta.equals(ale)){
            System.out.println("Que pena! Deu empate.");
        } else if ((resposta.equals( "pedra") && ale.equals("papel"))
           || (resposta.equals("papel") && ale.equals("tesoura"))
           || (resposta.equals("tesoura") && ale.equals("pedra"))){
            System.out.println("Que pena! Você perdeu.");
        } else {
            System.out.println("Parabéns! Você ganhou.");
        }

    }

}
