import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int eixo_x,eixo_y,comeco=1,caracteres=0;

        System.out.println("Digite o lado de seu quadrado");
        eixo_x = teclado.nextInt();
        eixo_y= eixo_x;

        while (comeco <= eixo_y ){
            System.out.print("*  ");
            
            caracteres++;

            if (caracteres==eixo_x){
                System.out.println();
                
                comeco++;
                
                caracteres=0;
            }   
        }
        teclado.close();
    }
}