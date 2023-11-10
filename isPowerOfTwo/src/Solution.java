/*
 * 注：该方法使用了位运“与”，2的幂n其二进制形式一定是1后面跟几个0，所以n-1一定是几位1，两个做与运算即可；
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}