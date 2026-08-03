import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int comeco,fim,soma_dos_pares=0;
        
        System.out.println("Digite o primeiro numero");
        comeco=teclado.nextInt();
        
        System.out.println("Digite o segundo numero");
        fim=teclado.nextInt();
        
        if (comeco>fim){
            System.out.println("Valores incorretos");
        }

        else{     

            while (comeco<fim-1){
                comeco++;
                
                if (comeco%2==0){
                    soma_dos_pares+=comeco;
                }
                    
            }
            System.out.println("A soma dos pares entre seus numeros é: " + soma_dos_pares);
        }   
    teclado.close();
    }
}
