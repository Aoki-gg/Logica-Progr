import java.util.Arrays;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int lista[] = new int[20];
        int lista2[] = new int[20];
        int contador=0,i=0,item=0,fim=0,flag=1,item1=0,tamanho=0;

        for (item=0; item<20; item++){
            lista[item]=teclado.nextInt();
            
            if (lista[item]!=1 && lista[item]!=0){
                System.out.println("entrada invalida, utilize 0 ou 1");
                flag=0;
            
            break;
            }
        }
        
        if (flag==1){
            fim=lista.length-1;

            while (i<=fim){
                if (lista[i]==0){
                    while (i <= fim && lista[i]==0){
                        contador+=1;
                        i+=1;
                    }
                }

                else if(lista[i]==1 ){
                    while (i <= fim && lista[i]==1){
                        contador+=1;
                        i+=1;
                    }
                }
                lista2[item1]=contador;
                item1++;
                tamanho++;
                contador=0;
            }
            int lista3[] = new int[tamanho];
            item1=0;

            for (int i2 : lista2){
                if (i2 != 0){
                    lista3[item1]=i2;
                    item1++;
                }
            }
            System.out.println(Arrays.toString(lista3));
        }
    teclado.close();
    }
}