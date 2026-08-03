import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class exercicio05 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        Random gerador= new Random();
        int numero=0,item=0,item1=0;
        int lista[] = new int[10];
        int lista2[] = new int[10];
        int lista3[] = new int[20];

        for (item=0; item<10 ;item++){
            numero=gerador.nextInt(1,100);
            lista[item]=numero;
            numero=gerador.nextInt(1,100);
            lista2[item]=numero;
            }
        for (item=0; item<19 ;item+=2){
            lista3[item]=lista[item1];
            lista3[item+1]= lista2[item1];
            item1++;
        }
        System.out.println("Primeira lista: "+ Arrays.toString(lista)); 
        System.out.println("Segunda lista: "+ Arrays.toString(lista2)); 
        System.out.println("Junção delas: " + Arrays.toString(lista3));     
        teclado.close();
    }

}