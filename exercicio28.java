import java.util.Random;
import java.util.Arrays;

public class exercicio04 {

    public static void main(String[] args){
        Random gerador= new Random();
        int numero=0,item=0,item1=0,contador=0;
        int lista[] = new int[10];
        int lista2[] = new int[20];
        int lista3[] = new int[20];

        for (item=0; item<20 ;item++){
            numero=gerador.nextInt(1,100);

            if (item<10){
                lista[item]=numero;     
            }

            numero=gerador.nextInt(1,100);
            lista2[item]=numero;
        }

        for (int i : lista) {
            boolean existe = false;

            for (int i2 : lista2) {
                if (i == i2) {
                    existe = true;
                    break;
                }
            }

            if (existe == false) {
                lista3[contador] = i;
                contador++;
            }
        }

        int lista4[] = new int[contador];

        for (int i : lista3){
            if (i!=0){
                lista4[item1]=i;
                item1++;
            }
        }
        
        System.out.println("Primeira lista: "+ Arrays.toString(lista)); 
        System.out.println("Segunda lista: "+ Arrays.toString(lista2)); 
        System.out.println("Termos diferentes: " + Arrays.toString(lista4));    
    }
}