/*
 * 注  ：该方法的遍历合集仅适用于本题（全小写字母）
 * 思路：灵活使用indexOf(char ch)函数，利用下标进行比较
 */

class Solution2 {
    public int firstUniqChar(String s) {
        int begin = 0, end = 0;
        int result = s.length();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            begin = s.indexOf(ch);
            end = s.lastIndexOf(ch);
            if (begin == end && begin != -1) {
                result = Math.min(result, begin);
            }
        }

        return result == s.length() ? -1 : result;
    }
}
