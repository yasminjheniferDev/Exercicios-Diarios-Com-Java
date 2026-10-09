import java.util.Scanner;

public class EVogalOuNao {
    public static void main(String[] args) {

        //Programa que utiliza Operador Relacional e Estrutura Condicional.
        //Programa que imprime se a letra é uma vogal ou consoante.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        char letra = entrada.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("É uma vogal.");
        } else{
            System.out.println("É uma consoante.");
        }
    }
}
