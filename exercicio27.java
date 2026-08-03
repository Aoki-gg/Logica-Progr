import java.util.Scanner;


public class exercicio03 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int numero=0,item=0,decrescimo,resultado=0;
        int lista[] = new int[5];

        for (item=0; item<5;){
            numero=teclado.nextInt();
            
            if (numero<0){
                System.out.println("Digite um inteiro e positivo");
            }
            
            else{
                lista[item]=numero;
                item++;
            }
        }
        for (item=0; item<lista.length;){
            resultado=lista[item];
            numero=lista[item];
            decrescimo=lista[item]-1;
            System.out.print("Fatorial de"+ "("+ numero + ")"+ ": ");

            while (decrescimo>1){
                resultado*=decrescimo;
                decrescimo--;
            }
            System.out.print(resultado);
            System.out.println();
            item++;
        }
        teclado.close();
    }
}