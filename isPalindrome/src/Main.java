/*
 * Date:  2018.05.24
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/
 * Title: 验证回文字符串
 *
 */

public class Main {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "";

        Solution2 handler = new Solution2();
        System.out.println(handler.isPalindrome(s1)+","+handler .isPalindrome(s2)+","+handler.isPalindrome(s3));;
    }

}
