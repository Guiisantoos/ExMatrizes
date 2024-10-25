import java.util.Scanner;

public class Ex2Matrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A, B, C;
        A = new int[2][2];
        B = new int[2][2];
        C = new int[2][2];
        int i, j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "] [" + (j + 1) + "] da matriz A: ");
                A[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "] [" + (j + 1) + "] da matriz B: ");
                B[i][j] = input.nextInt();
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\n\nConteudo da matriz A: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\n\nConteudo da matriz B: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\n\nConteudo da matriz C: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}