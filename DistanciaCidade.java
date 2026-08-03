import java.util.Scanner;

public class DistanciaCidade {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int Matriz[][] = new int[6][6];
        int partida = 10, destino = 0, soma = 0;

        Matriz[0][0] = 0;
        Matriz[0][1] = 384;
        Matriz[0][2] = 425;
        Matriz[0][3] = 115;
        Matriz[0][4] = 496;
        Matriz[0][5] = 91;

        Matriz[1][0] = 384;
        Matriz[1][1] = 0;
        Matriz[1][2] = 100;
        Matriz[1][3] = 270;
        Matriz[1][4] = 364;
        Matriz[1][5] = 475;

        Matriz[2][0] = 425;
        Matriz[2][1] = 100;
        Matriz[2][2] = 0;
        Matriz[2][3] = 311;
        Matriz[2][4] = 265;
        Matriz[2][5] = 516;

        Matriz[3][0] = 115;
        Matriz[3][1] = 270;
        Matriz[3][2] = 311;
        Matriz[3][3] = 0;
        Matriz[3][4] = 404;
        Matriz[3][5] = 206;

        Matriz[4][0] = 496;
        Matriz[4][1] = 364;
        Matriz[4][2] = 265;
        Matriz[4][3] = 404;
        Matriz[4][4] = 0;
        Matriz[4][5] = 587;

        Matriz[5][0] = 91;
        Matriz[5][1] = 475;
        Matriz[5][2] = 516;
        Matriz[5][3] = 206;
        Matriz[5][4] = 587;
        Matriz[5][5] = 0;

        while (true) {
            System.out.println(
                    "\n Curitiba: 0 \n Londrina: 1 \n Maringa: 2 \n Ponta Grossa: 3 \n Cascavel: 4 \n Paranaguá: 5");

            if (partida == 10) {
                System.out.print("Digite sua cidade de partida(caso deseje cancelar 99): ");
                partida = teclado.nextInt();

                System.out.print("Digite seu destino (caso deseje cancelar 99)");
                destino = teclado.nextInt();

                if (partida == 99 || destino == 99) {
                    break;
                }
            }

            else {
                System.out.print("Digite seu destino (caso deseje cancelar 99)");
                destino = teclado.nextInt();
                if (destino == 99) {
                    break;
                }
            }
            soma += Matriz[partida][destino];
            System.out.println(soma);
            partida = destino;
        }
        teclado.close();
    }
}
