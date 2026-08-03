import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int termo,termo_1=1,termo_2=1,soma,comeco=0;

        System.out.println("Digite até qual termo da fibbonaci você deseja ver");
        termo= teclado.nextInt();
        
        while (comeco<termo) {
            System.out.print(termo_1 + " ");
            
            soma = termo_1 + termo_2;
            
            termo_1 = termo_2;
            
            termo_2 = soma;
            
            comeco++;

        }

        teclado.close();
    }

}

        
