import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int n1,n2,n3,n4,media_ponderada;

            System.out.println("Digite o primeiro número");
            n1= teclado.nextInt();
            System.out.println("Digite o segundo número");
            n2= teclado.nextInt();
            System.out.println("Digite o terceiro número");
            n3= teclado.nextInt();
            System.out.println("Digite o quarto número");
            n4= teclado.nextInt();
            media_ponderada= (n1*1 + n2*2 + n3*3 + n4*4)/10;
            System.out.println("A sua média ponderada é " + media_ponderada);

    }
}