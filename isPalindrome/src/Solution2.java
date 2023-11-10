/*
 * 注：头尾指针
 */


class Solution2 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();//转换为小写
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex && startIndex < s.length() - 1) {
            char pre = s.charAt(startIndex);
            char aft = s.charAt(endIndex);

            if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))) {
                startIndex++;
                continue;
            }
            if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))) {
                endIndex--;
                continue;
            }

            if (pre != aft) {
                return false;
            }

            startIndex++;
            endIndex--;

        }

        return true;
    }
}
