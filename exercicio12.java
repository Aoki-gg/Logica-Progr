import java.util.Scanner;

public class exercicio05
{   
    public static void main(String[] args) 
    {        
        Scanner teclado = new Scanner(System.in);
        
        int lados_triangulo,l1,l2,l3;
        String tipo_triangulo;

        System.out.println("Digite um numero com 3 digitos onde cada digito será o tamanho de um dos lados:");
        
        lados_triangulo=teclado.nextInt();

        if (lados_triangulo<100 || lados_triangulo>1000)
            System.out.println("Entrada invalida");
        else{ 

            l1= lados_triangulo % 10;
            
            l2 = (lados_triangulo/10)% 10;
            
            l3 = (lados_triangulo/100)% 10;

            if (l1==l2 && l1==l3){
                tipo_triangulo="Equilátero";
            }

            else if(l1==l2 || l1==l3 || l2==l3 ){
                tipo_triangulo="isóceles";
            }

            else{
                tipo_triangulo="escaleno";
            }
            System.out.println("O tipo do seu triangulo é: "+ tipo_triangulo);
            
            teclado.close();
        }
    }
}
