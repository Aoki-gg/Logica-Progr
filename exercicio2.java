import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int numero,centena,dezena,unidade;
        
            System.out.println("Digite seu número com 3 digitos");
            numero= teclado.nextInt();
            unidade= numero% 10;
            dezena = (numero/10)% 10;
            centena = (numero/100)% 10;
            System.out.println("O inverso do seu número é " + unidade + dezena + centena);

    }

}