/*
 * Date:  2018.05.25
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/60/
 * Title: Fizz Buzz
 *
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 5;
        Solution handler = new Solution();
        List<String> list = handler.fizzBuzz(n2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
