import java.util.Scanner;

public class Ex1Matrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[][];
        int i, j, soma = 0;
        numeros = new int[4][4];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição [" + (i + 1) + "][" + (j + 1) + "] da matriz: ");
                numeros[i][j] = input.nextInt();
                soma = soma + numeros[i][j];
            }
        }
        System.out.println("Conteúdo da Matriz: ");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("\nValor da soma dos elementos da matriz: " + soma);
    }
}
