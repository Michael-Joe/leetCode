/*
 * 注：无技术含量，要注意java中字符串拼装可以是根据位置来的，见第10行
 */

class Solution3 {
    public String reverseString(String s) {
        String reverse = "";//是空串，不是null

        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;//在字符串前面连接
        }
        return reverse;
    }
}
