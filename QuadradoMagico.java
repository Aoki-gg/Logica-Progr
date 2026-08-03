import java.util.Random;

public class QuadradoMagico {

    public static void main(String[] args) {
        Random gerador = new Random();
        int Matriz[][] = new int[3][3];
        int i, j;
        int diag_p = 0, diag_s = 0, linha = 0, coluna = 0;

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                Matriz[i][j] = gerador.nextInt(1, 9);
            }
        }
        System.out.println();
        System.out.println("Matriz original");

        for (i = 0; i <= 2; i++) {
            System.out.print("\n");
            for (j = 0; j <= 2; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
        }

        for (i = 0; i <= 2; i++) {
            diag_p += ((Matriz[i][i]));
        }

        for (i = 2; i >= 0; i--) {
            diag_s += (Matriz[(Matriz.length - 1) - i][i]);
        }

        if (diag_p != diag_s) {
            System.out.println();
            System.out.println("Não é um quadrado mágico");
            System.exit(0);
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                coluna += (Matriz[j][i]);
            }
            if (coluna != diag_p) {
                System.out.println();
                System.out.println("Não é um quadrado mágico");
                System.exit(0);
            } else {
                coluna = 0;
            }
        }
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                linha += (Matriz[i][j]);
            }
            if (linha != diag_p) {
                System.out.println();
                System.out.println("Não é um quadrado mágico");
                System.exit(0);

            } else {
                linha = 0;
            }
        }
        System.out.println();
        System.out.println("É um quadrado mágico");
    }
}
