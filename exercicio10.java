import java.util.Scanner;

public class exercicio03 
{   
    public static void main(String[] args) 
    {        
        Scanner teclado = new Scanner(System.in);
        
        int numero=0;
        String tipo;
        
        System.out.println("Digite um numero: ");
        
        numero=teclado.nextInt() ;
        
        if (numero%2==0){
            tipo="par";
        }

        else{
            tipo="impar";
        }
        System.out.println("Seu numero é " + tipo);
        teclado.close();
    }
}
