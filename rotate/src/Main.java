/*
 * Date:  2018.05.18
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 * Title: 旋转图像
 *
 */

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        Solution handler = new Solution();
        handler.rotate(matrix2);
        for (int i = 0; i < matrix2.length; i++)

        {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(matrix2[i][j]+",");
            }
            System.out.println();
        }
    }
}
