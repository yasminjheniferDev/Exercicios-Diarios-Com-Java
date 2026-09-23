import java.util.Scanner;

public class AproveitamentoDeUmAluno {
   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
       System.out.println("Digite a sua primeira nota:");
       double n1= entrada.nextDouble();
       System.out.println("Digite a sua segunda nota:");
       double n2= entrada.nextDouble();

       double media= (n1 + n2) / 2;
       if(media >=9 && media <=10) {
           System.out.println("Classificação A");
       } else if (media >=8 && media <9) {
           System.out.println("Classificação B");
       } else if(media >=7 && media <8) {
           System.out.println("Classificação C");
       }else if(media >=6 && media <7) {
           System.out.println("Classificação D");
       } else if(media >=5 && media < 6){
           System.out.println("Classificação E");
       }else{
           System.out.println("Classificação F");10
       }
       entrada.close();
    }
}
