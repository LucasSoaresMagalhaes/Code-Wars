class MatrixDeterminant {

    public static void main(String[] args) {
        int[][][] matrix = { { { 1 } },
                { { 1, 3 }, { 2, 5 } },
                { { 2, 5, 3 }, { 1, -2, -1 }, { 1, 3, 4 } } };
        System.out.println(Definirmatrix(matrix[2]));

    }

    public static int Definirmatrix(int[][] matrix) {

        int sinal = 1;

        int determinante = 0;

        if (matrix.length == 1) {
            return determinante;
        }
        if (matrix.length == 2) {
            determinante = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
            return determinante;
        }

        for (int i = 0; i < matrix.length; i++) {
            int[][] matrixMenor = new int[matrix.length - 1][matrix.length - 1];

            for (int j = 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    if (k < i) {
                        matrixMenor[j - 1][k] = matrix[j][k];
                    } else if (k > i) {
                        matrixMenor[j - 1][k - 1] = matrix[j][k];
                    }
                }
            }

            determinante += sinal * matrix[0][i] * Definirmatrix(matrixMenor);
            sinal *= -1;
        }

        if (determinante == 0) {
            return 0;
        }
        return determinante;

    }
}