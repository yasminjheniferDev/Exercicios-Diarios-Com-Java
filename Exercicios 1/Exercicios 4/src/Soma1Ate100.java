public class Soma1Ate100 {
    public static void main(String[] args) {

        //Programa que utiliza laço for.
        //Programa que lê os números de 1 até 100, somando cada número, e imprime a soma final de todos esses números.

        int soma=0;
        for(int n = 1; n <=100;n++){
            soma+=n;

        }
        System.out.println("A soma total dos números é = " + soma);
    }
}
