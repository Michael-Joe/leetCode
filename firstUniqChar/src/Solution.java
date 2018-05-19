/*
 * 注：两次for循环遍历字符数组，比较
 */
class Solution {
    public int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (i == j)
                    continue;
                if (str[i] == str[j]) {
                    count = 1;
                    break;
                }
            }
            if (count == 1) {
                count = 0;
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }
}