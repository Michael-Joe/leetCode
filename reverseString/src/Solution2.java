/*
 * 注：毫无技术含量，调用java自带的reverse()方法反转，但也记录一下
 */
class Solution2 {
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
