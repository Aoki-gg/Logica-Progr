import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int comeco=0,numero,multiplicacao=1;

        System.out.println("Digite um numero inteiro");
        numero=teclado.nextInt();
        
        if(numero<=0){
            System.out.println("digite um numero positivo");
        }

        else{

            while (numero>comeco){
                multiplicacao=multiplicacao*numero;
                numero--;
                
                }
            System.out.println("O fatorial do seu numero é: " + multiplicacao);
            }
        teclado.close();
        }
    }
