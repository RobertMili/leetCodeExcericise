package matrixDiagonalSum;

public class Main {
}
class Solution {
    public int diagonalSum(int[][]mat) {

        int sum = 0;
        if (mat.length % 2 == 1) {
            for (int i = 0; i < mat.length; i++) {
                if (i == mat.length / 2) {
                    continue;
                }
                sum += mat[i][i];
            }

            for (int i = mat.length - 1; i >= 0; i--) {
                sum += mat[i][mat.length - 1 - i];
            }
            return sum;
        } else {
                for (int i = 0; i < mat.length; i++) {

                    sum += mat[i][i];
                }

                for (int i = mat.length - 1; i >= 0; i--) {
                    sum += mat[i][mat.length - 1 - i];
                }
        }
        return sum;
    }

    public int betterSolution(int[][]mat) {
        int diagonalSum = 0;
        int matrixSize = mat.length;

        for (int i = 0; i < matrixSize; i++) {
            diagonalSum += mat[i][i];
        }
        for (int i = 0; i < matrixSize; i++) {
            diagonalSum += mat[i][matrixSize - 1 -i ];
        }

        if (matrixSize % 2 == 1) {
            diagonalSum -= mat[matrixSize / 2][matrixSize / 2];
        }
        return diagonalSum;
    }
}
