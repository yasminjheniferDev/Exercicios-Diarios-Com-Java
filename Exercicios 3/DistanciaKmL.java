import java.util.Scanner;

public class DistanciaKmL {
    public static void main(String[] args) {

        //Programa que utiliza Operadores Aritméticos.
        //Programa que lê uma pergunta pronta e imprime uma resposta.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Irei percorrer uma distância de 100km. Meu carro faz em média 25km/l.Quantos litros irei gastar nesse percurso?");

        int litrostotal= 100 / 25;
        System.out.println("O total de litros gastos vai ser igual a = " + litrostotal + " litros.");
    }
}
