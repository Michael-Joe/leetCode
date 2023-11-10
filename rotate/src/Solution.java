/*
 * 思路：先沿着y=-x转置，之后以行为单位或者以列为单位，将该行数值倒序即可；
 */

class Solution {
    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                //转置该矩阵
                if (i == j)
                    continue;
                else {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int m = 0, n = matrix.length - 1;
            while (m < n) {
                int temp = matrix[i][m];
                matrix[i][m] = matrix[i][n];
                matrix[i][n] = temp;

                m++;
                n--;
            }
        }
    }
}
