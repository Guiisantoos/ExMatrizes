import java.util.Scanner;

public class Ex6Matrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz;
        matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("digite o valor da posição [" + (i + 1) + "] [" + (j + 1) + "] da matriz: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\nImprimindo elementos ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("  " + matriz[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}