import java.util.Arrays;
import java.util.Random;

public class exercicio03 {

    public static void main(String[] args){
        Random gerador= new Random();
        int lista[] = new int[4];
        int i,soma=0;

        for (i=0;i<4;i++){
            lista[i]=gerador.nextInt(10,99+1);
            }       

        System.out.println("Vetor Aleatório: " + Arrays.toString(lista));

        for (int item : lista){
            soma+=item;
        }

        System.out.println("Valor médio: "+ soma/lista.length);
        
    }
}