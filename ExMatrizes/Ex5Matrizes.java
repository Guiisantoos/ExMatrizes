import java.util.Scanner;

public class Ex5Matrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz;
        matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "] [" + (j + 1) + "] da matriz: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("MATRIZ: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\nImprimindo a diagonal principal da matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println("");
        System.out.println("\nImprimindo a diagonal seguncária da matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 5 - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println("");
    }
}