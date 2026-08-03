import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int numero,i=0;
    
        System.out.println("Digite um numero limite: ");
        numero=teclado.nextInt();

        if (numero <= 0){
            System.out.println("Entrada invalida");
        }

        else{
            while (i <= numero - 1){
                if (i % 2 != 0){
                    System.out.print(i + " ");
                }

                i++;

            }
        }
    teclado.close();
    }
}