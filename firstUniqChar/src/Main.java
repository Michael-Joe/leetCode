/*
 * Date:  2018.05.20
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/
 * Title: 字符串中的第一个唯一字符
 *
 */

public class Main {
    public static void main(String[] args) {
        String s1="leetcode";
        String s2="eeetcode";
        String s3="loveleetcode";

        Solution3 handler=new Solution3();
        System.out.println(handler.firstUniqChar(s1));
        System.out.println(handler.firstUniqChar(s2));
        System.out.println(handler.firstUniqChar(s3));

    }
}
