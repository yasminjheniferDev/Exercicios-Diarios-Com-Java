import java.util.Scanner;

public class CalculoIMC {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos kilos você está pesando?");
        double kilos= entrada.nextDouble();
        System.out.println("Qual a sua altura?");
        double altura= entrada.nextDouble();

        double IMC= kilos /Math.pow(altura,2);

        System.out.printf("O seu IMC é =  %.2f. %n" , IMC );

         if(IMC >=18 & IMC < 25){
             System.out.println("Parabéns! Você está no seu peso ideal.");
         } else{
             System.out.println("Você não está na faixa de peso ideal.");
         }

        entrada.close();
    }
}
