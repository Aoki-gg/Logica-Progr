import java.util.Scanner;

public class exercicio01 
{   
    public static void main(String[] args) 
    {        
        Scanner teclado = new Scanner(System.in);
        
        int numero=0;
        String tipo;

        System.out.println("Digite um numero:");
        
        numero= teclado.nextInt();

        if (numero>0){
            tipo="POSITIVO";
        }

        else if(numero<0){
            tipo="NEGATIVO";
        }

        else{
            tipo="NEUTRO";
        }
        System.out.println("Seu numero é " + tipo);
        teclado.close();
    }
}