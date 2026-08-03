import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int diagonal_maior,diagonal_menor,area;

            System.out.println("Qual a diagonal maior do seu losango?");
            diagonal_maior= teclado.nextInt();
            System.out.println("Qual a diagonal menor do seu losango?");
            diagonal_menor= teclado.nextInt();
            area=(diagonal_maior*diagonal_menor)/2;
            System.out.println("A area do seu losango é "+ area);


    }
}