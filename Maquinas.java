import java.util.Scanner;

public class Maquinas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int Matriz[][] = new int[5][5];
        int coluna = 0, i, j, maior_custo = 0, maquina_cara = 0,maquina_barata =0,produto_caro=0,produto_barato=0, menor_custo = 999999, linha = 0, mais_caro = 0,
                mais_barato = 999999,media =0,custo_total=0;

        Matriz[0][0] = 12;
        Matriz[0][1] = 20;
        Matriz[0][2] = 18;
        Matriz[0][3] = 25;
        Matriz[0][4] = 30;

        Matriz[1][0] = 15;
        Matriz[1][1] = 22;
        Matriz[1][2] = 17;
        Matriz[1][3] = 28;
        Matriz[1][4] = 35;

        Matriz[2][0] = 10;
        Matriz[2][1] = 18;
        Matriz[2][2] = 16;
        Matriz[2][3] = 24;
        Matriz[2][4] = 32;

        Matriz[3][0] = 14;
        Matriz[3][1] = 21;
        Matriz[3][2] = 19;
        Matriz[3][3] = 26;
        Matriz[3][4] = 33;

        Matriz[4][0] = 11;
        Matriz[4][1] = 19;
        Matriz[4][2] = 15;
        Matriz[4][3] = 23;
        Matriz[4][4] = 31;

        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++) {
                coluna += (Matriz[j][i]);
            }
            media = coluna/5;
            if (media >= maior_custo) {
                maior_custo = media;
                maquina_cara = i;
            }
            if (media <= menor_custo) {
                menor_custo = media;
                maquina_barata = i;
            }
            coluna = 0;
        }

        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++) {
                linha += (Matriz[i][j]);
            }
            if (linha > mais_caro) {
                mais_caro = linha;
                produto_caro = i;
            }
            if (linha < mais_barato) {
                mais_barato = linha;
                produto_barato = i;
            }
            custo_total+=linha;
            linha = 0;
        }
        System.out.println("Custo total: "+ custo_total + "\nMaquina mais cara: " + maquina_cara + "\n Maquina mais barata: " + maquina_barata
                + "\n produto mais caro de produzir: " + produto_caro + "\n produto mais barato de produzir: "
                + produto_barato);
    }
}
