import java.util.Scanner;

public class MesEEstacao {
    public static void main(String[] args) {

        //Programa que utiliza estrutura condicional ( switch).
        //Programa que imprime o mês e a estação do ano.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que mês estamos?");
        String mes= entrada.nextLine();

        String nomeMes;
        String estacao;

        switch (mes){

            case "janeiro":
                nomeMes = "janeiro";
                estacao = "verão";
                break;
            case "fevereiro":
                nomeMes = "fevereiro";
                estacao = "verão";
                break;
            case "março":
                nomeMes = "março";
                estacao = "verão/outono";
                break;
            case "abril":
                nomeMes = "abril";
                estacao = "outono";
                break;
            case "maio":
                nomeMes = "maio";
                estacao = "outono";
                break;
            case "junho":
                nomeMes = "junho";
                estacao = "outono/inverno";
                break;
            case "julho":
                nomeMes = "julho";
                estacao = "inverno";
                break;
            case "agosto":
                nomeMes = "agosto";
                estacao = "inverno";
                break;
            case "setembro":
                nomeMes = "setembro";
                estacao = "inverno/primavera";
                break;
            case "outubro":
                nomeMes = "outubro";
                estacao = "primavera";
                break;
            case "novembro":
                nomeMes = "novembro";
                estacao = "primavera";
                break;
            case "dezembro":
                nomeMes = "dezembro";
                estacao = "primavera/verão";
                break;
            default:
                nomeMes = "inválido";
                estacao = "inválida";
                break;




        }
        System.out.println(nomeMes + " - " + estacao);
    }
}
