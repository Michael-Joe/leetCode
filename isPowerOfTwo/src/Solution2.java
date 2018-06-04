/*
 * 注：该方法同样使用了与，同样利用了2的幂n其二进制格式一定是最高位为1，其余位为0，且只有一位为1。
 *    将其与1做与运算，再右移一位，并将运算结果求和，若结果大于1则为false
 */
class Solution2 {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }

        return count == 1;
    }
}