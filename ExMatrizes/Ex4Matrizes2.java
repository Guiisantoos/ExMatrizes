public class Ex4Matrizes2 {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j <= i) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("MATRIZ: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j]+ " | ");
            }
            System.out.println("");
        }
    }
}