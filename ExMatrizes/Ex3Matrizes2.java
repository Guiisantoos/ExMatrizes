import java.util.Scanner;

public class Ex3Matrizes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A, B, C;
        A = new int[2][2];
        B = new int[2][2];
        C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "] [" + (j + 1) + "] da matriz A: ");
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "] [" + (j + 1) + "] da matriz B: ");
                B[i][j] = input.nextInt();
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Conteúdo da Matriz A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("Conteúdo da Matriz B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("Conteúdo da Matriz C: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}