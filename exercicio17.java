import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int numero,incremento,i=0;
        
        System.out.println("Digite o limite: ");
        numero=teclado.nextInt();
        
        System.out.println("Digite o intervalo: ");
        incremento=teclado.nextInt();

        if (numero <= 0 || incremento <= 0){
            System.out.println("Entrada invalida");
        }

        else{
            while (i < numero + 1){
                System.out.print(i + " ");
                
                i = i + incremento;
            }
        }
    teclado.close();
    }
}