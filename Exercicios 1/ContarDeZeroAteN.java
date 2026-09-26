import java.util.Scanner;

public class ContarDeZeroAteN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quer contar até quantos?");
        int  n= entrada.nextInt();
        int cont=0;

        while(cont <= n){
            System.out.println(cont);
            cont++;
        }
    }
}
