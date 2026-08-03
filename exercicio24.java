import java.util.Arrays;
import java.util.Random;

public class exercicio01 {

    public static void main(String[] args){
        Random gerador= new Random();
        int lista[] = new int[12];
        int i,vinte_quarenta=0,maior_35=0;
 
        for (i=0;i<12;i++){
            lista[i]=gerador.nextInt(10,50+1);
            }       
        
        System.out.println("- Vetor Aleatório: " + Arrays.toString(lista));

        System.out.print("- Quantidade de numeros entre 20 e 40: ");
        
        for (int item : lista){
            if (item>=20 && item<=40){
                vinte_quarenta++;

                System.out.print(item + " ");
            }
        }

        System.out.print("("+ vinte_quarenta+")");

        System.out.println();

        System.out.print("- Números pares: ");

        for (int item : lista){
            if (item%2==0){
                System.out.print(item + " ");
            }
        }

        System.out.println();

        for (int item : lista){
            if (item>35){
                maior_35++;
            }
        }
        System.out.print("- Quantidade de numeros maiores que 35: "+ maior_35);
    }
}
