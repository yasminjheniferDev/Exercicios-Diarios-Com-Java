public class MesesDoAno {
    public static void main(String[] args) {

        //Programa que utiliza arrays e laço for.
        //Programa que imprime os nomes dos meses do ano e a quantidade de dias que cada mês tem.

        String mes[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int Tot[]={31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=0;i<mes.length;i++){
            System.out.println(mes[i] + " tem " + Tot[i] + " dias.");

        }
    }
}
