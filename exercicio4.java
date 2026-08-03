import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int razao,primeiro_termo,decimo_termo;

            System.out.println("Qual é o primeiro termo da sua PA?");
            primeiro_termo= teclado.nextInt();
            System.out.println("E qual sua razão?");
            razao= teclado.nextInt();
            decimo_termo= primeiro_termo + (10-1)* razao;
            System.out.println("O décimo termo da sua PA é "+ decimo_termo);
    }
}