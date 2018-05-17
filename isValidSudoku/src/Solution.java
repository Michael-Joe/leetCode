class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] flag = new int[10];

        //首先检验行
        for (int i = 0; i < 9; i++) {
            flag = new int[10];
            for (int j = 0; j < 9; j++) {
                if ((board[i][j] - '.') == 0)
                    continue;
                else {
                    if (flag[board[i][j] - '0'] == 1)
                        return false;
                    flag[board[i][j] - '0'] = 1;
                }
            }
        }

        //其次检验列
        flag = new int[10];
        for (int i = 0; i < 9; i++) {
            flag = new int[10];
            for (int j = 0; j < 9; j++) {
                if ((board[j][i] - '.') == 0)
                    continue;
                else {
                    if (flag[board[j][i] - '0'] == 1)
                        return false;
                    flag[board[j][i] - '0'] = 1;
                }
            }
        }

        //检验九个独立小方格
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                //独立检验方格
                flag = new int[10];
                for (int m = i; m < i + 3; m++) {
                    for (int n = j; n < j + 3; n++) {

                        if ((board[m][n] - '.') == 0)
                            continue;
                        else {
                            if (flag[board[m][n] - '0'] == 1)
                                return false;
                            flag[board[m][n] - '0'] = 1;
                        }
                    }

                }
            }
        }

        //全部检验完成
        return true;
    }

}
