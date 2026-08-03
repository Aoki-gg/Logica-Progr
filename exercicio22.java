import java.util.Arrays;
import java.util.Random;

public class exercicio02 {

    public static void main(String[] args){
        Random gerador= new Random();
        int lista[] = new int[12];
        int i,maior=0,menor=0,pos_maior=0,pos_menor=0,posicao=0;

        for (i=0;i<12;i++){
            lista[i]=gerador.nextInt(10,13+1);
            }       
        
        maior= lista[0];
        menor=lista[0];

        System.out.println("Vetor Aleatório: " + Arrays.toString(lista));

        for (int item : lista){
            if (item > maior){
                maior = item;
                if (item!=lista[pos_maior]){
                    pos_maior = posicao;
                }
            }

            if (item < menor){
                menor = item;
                if (item!=lista[pos_menor]){
                    pos_menor = posicao;
                }
            }

            posicao++;
        }
        System.out.println("Maior elemento: " + maior+" / "+ "Posição: " + (pos_maior+1));
        System.out.println("Maior elemento: " + menor+" / "+ "Posição: " + (pos_menor+1));
    }
}