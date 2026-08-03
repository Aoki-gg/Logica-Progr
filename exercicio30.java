import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;


public class aula17{        
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        String principal ="";
        String composto= "";
        int caracteres = 0;
        int caracteres2 = 0;
        String limite= "";
        int num = 0;


        System.out.print("Digite seu nome:");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();
        String[] nome3 = nome.split(" ");

        for (int i = 0 ; i < nome3.length ; i ++){
            if (nome3[i].equals("DOS") || nome3[i].equals("DAS") || nome3[i].equals("DO") || nome3[i].equals("DA")){
                nome3[i] =nome3[i].replace(nome3[i], " ");
            }
        }


        principal = nome3[nome3.length - 2];
        composto = nome3[nome3.length - 1];
        
        if (composto.equals("FILHO") || composto.equals("NETO") || composto.equals("JUNIOR")){
            principal = principal + " " + composto + ", "; 
            num = 2;
        }
        
        else{
            principal = composto + ", ";
            num = 1;
        }
        
        for (int i = 0 ; i < nome3.length ; i++){
            if (!nome3[i].equals(" ")){
                limite = limite + nome3[i] + " ";
            }
        }

        for (int i = 0 ; i < limite.length()-1; i++){
            if (limite.charAt(i) == ' '){
                caracteres++;
            }
        }

        principal = principal + limite.charAt(0) + ".";
        for (int i = 0 ; i < limite.length() -1 ; i++){
            if (num==2){
                if (limite.charAt(i) == ' ' && caracteres2 < caracteres -2 ){
                caracteres2++;
                principal = principal + limite.charAt(i+1) + "." ;
                }
            }
           
            else{
                if (limite.charAt(i) == ' ' && caracteres2 < caracteres -1 ){
                caracteres2++;
                principal = principal + limite.charAt(i+1) + "." ;
                }
            }
        }
        System.out.println(principal);
    }
}

