import java.util.Scanner;

public class exercicio04 
{   
    public static void main(String[] args) 
    {        
        Scanner teclado = new Scanner(System.in);
        
        int idade;
        String faixa_etaria;

        System.out.println("Qual a idade do individuo?");
        
        idade=teclado.nextInt();

        if (idade <= 11){
            faixa_etaria="Criança";
        }

        else if (idade> 11 && idade<=17){
            faixa_etaria="Adolescente";
        }

        else if (idade> 17 && idade<=59){
            faixa_etaria="Adulto";
        }

        else{
            faixa_etaria="Idoso";
        }

        System.out.println("O individuo esta na faixa etaria: "+ faixa_etaria);
        teclado.close();
    }
}
