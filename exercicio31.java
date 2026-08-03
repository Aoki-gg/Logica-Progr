import java.util.Scanner;
import java.util.regex.*;
import java.util.Arrays;

public class aula18{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String abreviatura= "";

        System.out.print("Digite seu nome:");
        String array[]= teclado.nextLine().toUpperCase().split(" ");

        if (array[array.length-1].matches("FILHO|NETO|JUNIOR")){
            abreviatura= array[array.length-2] +" " + array[array.length-1]+ ", ";
            array[array.length-1]="";
            array[array.length-2]="";
        }

        else{
            abreviatura=array[array.length-1]+ ", ";
            array[array.length-1]="";
        }

        for (int i = 0 ; i < array.length-1; i++){
            if (!array[i].equals("") && array[i].matches("DOS|DAS|DO|DA|DE|DI")== false)
                abreviatura+= array[i].charAt(0) + ".";
        }

        System.out.println(abreviatura);
    }
}

