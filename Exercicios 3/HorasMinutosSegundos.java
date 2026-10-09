import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class HorasMinutosSegundos {
    public static void main(String[] args) {

        //Programa que utiliza Operadores Aritméticos.
        //Programa que imprimi as horas, minutos e segundos, utilizando um número de segundos escolhido pelo usuário.
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite um valor em segundos:");
        int seg= entrada.nextInt();
        int horas= seg / 3600;
        int minutos= (seg % 3600 ) / 60;
        int segt = seg % 60;

        System.out.println( horas + ":" + minutos + ":" + segt );



    }
}
