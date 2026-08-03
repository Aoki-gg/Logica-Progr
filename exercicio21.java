import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int termo=10,termo_1,termo_2,soma,comeco=1;

        System.out.println("Digite o primeiro termo: ");
        termo_1=teclado.nextInt();

        System.out.println("Digite o segundo termo: ");
        termo_2=teclado.nextInt();


        while (comeco < termo + 1) {
            System.out.print(termo_1 + " ");
            
            if (comeco % 2 == 0){
                soma = termo_2 - termo_1;
            }

            else{
                soma = termo_2 + termo_1;
            }
            
            termo_1 = termo_2;
            
            termo_2 = soma;
            
            comeco++;
        }
        teclado.close();
    }
}
