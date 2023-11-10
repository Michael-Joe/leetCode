/*
 * 注：该方法两次遍历，时间复杂度较高
 */

class Solution {
    public boolean isPalindrome(String s) {
        char[] str = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.toCharArray()[i] >= 'A') && (s.toCharArray()[i] <= 'Z')) {
                str[count++] = (char) (s.toCharArray()[i] + 32);//转换为小写
            } else if ((s.toCharArray()[i] >= 'a') && (s.toCharArray()[i] <= 'z')) {
                str[count++] = s.toCharArray()[i];
            } else if ((s.toCharArray()[i] >= '0') && (s.toCharArray()[i] <= '9')) {
                str[count++] = s.toCharArray()[i];
            }
        }

        int i = 0, j = count - 1;
        while (i < j) {
            if (str[i] != str[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}