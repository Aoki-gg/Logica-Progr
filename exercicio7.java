import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int horas_atual,horas,minutos,horas_to_minuto,resultado;

            System.out.println("Qual a hora atual? (digite sem caracteres)");
            horas_atual=teclado.nextInt();
            horas=(horas_atual/100)% 100;
            minutos= horas_atual % 100;
            horas_to_minuto= horas*60;
            resultado= horas_to_minuto + minutos;
            System.out.println("Desde o começo do dia ja se passaram " + resultado + " minutos");

    }
}