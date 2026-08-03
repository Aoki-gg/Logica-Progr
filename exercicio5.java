import java.util.Scanner;
import java.lang.Math;

public class exercicio5 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        double razao,n_termos,primeiro_termo,resultado;

            System.out.println("Qual é o primeiro termo da sua PG?");
            primeiro_termo= teclado.nextInt();
            System.out.println("Qual termo você quer saber?");
            n_termos= teclado.nextInt();
            System.out.println("E qual sua razão?");
            razao= teclado.nextInt();
            resultado= primeiro_termo * (Math.pow(razao,n_termos-1));
            System.out.println("O quinto termo da sua PA é "+ resultado);
    }
}