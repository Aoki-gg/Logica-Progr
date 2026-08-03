import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int i=0,numero=0,termos,soma=0;
    
        System.out.println("Digite quantos termos impares deseja somar ");
        termos=teclado.nextInt();

        if (termos <= 0){
            System.out.println("Entrada invalida");
        }
        
        else{
            while (i < termos){
                numero+=1;
                
                if (numero % 2 != 0){
                    soma=soma+numero;
                    
                    i++;
                }
            }
            System.out.println(soma);
        }
    teclado.close();
    }
}