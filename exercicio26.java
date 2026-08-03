import java.util.Scanner;
import java.util.Arrays;

public class exercicio02 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int numero=0,item=0,tamanho=0;
        int lista[] = new int[10];

        for (item=0; item<10;){
            numero=teclado.nextInt();
            
            if (numero>=0){
                lista[item]=numero;
                item++;
                tamanho++;
            }
            else{
                break;
            }
        }
        item=0;

        int lista2[] = new int[tamanho];

        for (int i : lista){
            if (i != 0){
                lista2[item]=i;
                item++;
            }
        }
        
        int[] ordenado = new int[lista2.length];

        boolean[] usado = new boolean[lista2.length];

        for (int i = 0; i < lista2.length; i++) {

            int menor = Integer.MAX_VALUE;
            int indiceMenor = -1;

            for (int j = 0; j < lista2.length; j++) {
                if (!usado[j] && lista2[j] < menor) {
                    menor = lista2[j];
                    indiceMenor = j;
                }
            }

            ordenado[i] = menor;
            usado[indiceMenor] = true;
        }
        System.out.println(Arrays.toString(ordenado));
        teclado.close();
    }
}