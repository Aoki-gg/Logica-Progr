import java.util.Scanner;

public class exercicio02 
{   
    public static void main(String[] args) 
    {        
        Scanner teclado = new Scanner(System.in);
        
        int n1,n2,n3,maior,menor;

        System.out.println("Digite o primeiro numero");
        
        n1=teclado.nextInt();

        System.out.println("Digite o primeiro numero");
        
        n2=teclado.nextInt();

        System.out.println("Digite o primeiro numero");
        
        n3=teclado.nextInt();

        maior=n1;
        menor=n1;

        if (n2>n1){
            maior=n2;
        }
        else{
            menor=n2;
        }

        if (n3>maior){
            maior=n3;
        }
        
        else{
            if (n3<menor){
                menor=n3;
            }
        }
        System.out.println("Seu MAIOR e MENOR numero respectivamente são: "+maior +" e " + menor);
        teclado.close();
    }
}