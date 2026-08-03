import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int valor_hora, aulas_mes, resultado_bruto,resultado_liquido;

           System.out.println("Quanto é pago ao professor por hora?");
           valor_hora=teclado.nextInt();
           System.out.println("Quantas aulas o professor deu no mês?");
           //Assume que cada aula tem duração de 1 hora//
           aulas_mes=teclado.nextInt();
           resultado_bruto= valor_hora*aulas_mes;
           //Assumindo a aliquota mais alta de 14%//
           resultado_liquido=resultado_bruto - (resultado_bruto*14/100);
           System.out.println("O salario do professor será de " + resultado_liquido);

    }
}