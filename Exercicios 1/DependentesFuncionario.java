import java.util.Scanner;

public class DependentesFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do funcionário?");
        String nome= entrada.nextLine();
        System.out.println("Qual o salário do funcionário?");
        double sal= entrada.nextDouble();
        System.out.println("Qual é a quantidade de dependentes?");
        int dep= entrada.nextInt();
         double nsal=0;
        if( dep == 0){
            nsal = sal + (sal*5/100);
        } else if(dep ==1 || dep == 2 || dep ==3){
            nsal = sal + (sal*10/100);
        }else if(dep ==4 || dep == 5 || dep ==6) {
            nsal = sal + (sal*15/100);
        } else{
            nsal= sal +(sal*18/100);

        }
        System.out.printf("O novo salário de %s , será de R$ %.2f.",nome,nsal);

        entrada.close();
    }
}
