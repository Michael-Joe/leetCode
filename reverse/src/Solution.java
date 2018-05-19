/*
 * 注：本方法用了字符串，只是因为题目属于字符串这个集合，实际上使用字符串的方法并不高效
 * 思路：将数字变成字符数组，数组颠倒后输出即可
 */
class Solution {
    public int reverse(int x) {
        try {
            String s = String.valueOf(x);
            //String num =Integer.toString(x);//该行和上一行效果一样，都是整形数字转字符串
            char[] num = s.toCharArray();
            if (num[0] == '-') {
                reverseArray(num, 1, num.length - 1);
            } else {
                reverseArray(num, 0, num.length - 1);
            }
            return Integer.parseInt(String.valueOf(num));
        } catch (Exception e) {
            return 0;
        }

    }

    public void reverseArray(char[] num, int begin, int end) {
        while (begin < end) {
            char ch_temp = num[begin];
            num[begin] = num[end];
            num[end] = ch_temp;

            begin++;
            end--;
        }
    }

}
