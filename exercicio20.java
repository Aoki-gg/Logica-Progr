import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int i=1,numero,termos,maior,menor;
        float soma,media;
    
        System.out.println("Digite quantos numeros voce deseja digitar: ");
        termos=teclado.nextInt();

        if (termos <= 0){
            System.out.println("Entrada invalida");
        }

        else{
            System.out.println("Digite um numero: ");
            numero=teclado.nextInt();

            maior=numero;

            menor=numero;

            soma=numero;

            while (i < termos){
                System.out.println("Digite um numero");
                numero=teclado.nextInt();

                if (numero > 0){
                    if (numero > maior){
                        maior = numero;
                    }
                    if (numero < menor){
                        menor = numero;
                    }
                }
                soma+=numero;

                i++;
            } 
            media=soma/termos;

            System.out.println("Seu maior numero é: "+ maior + " seu menor numero é: "+ menor + " a média deles é: " +media);
        }
    teclado.close();
    }
}