/*
 * 注：该方法相较字符串数组来说更为高效
 * 思路：使用模运算和除法，取各位，再拼装成数字；
 */

class Solution2 {
    public int reverse(int x) {
        boolean negative = x < 0;//<优先级高于=
        if (negative)
            x = -x;
        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (negative)
            rev = -rev;
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        return (int) rev;
    }
}
