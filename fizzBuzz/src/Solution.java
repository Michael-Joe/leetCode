import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 0)
            return list;

        int i = 1;
        while (i <= n) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
                //list.add(Integer.toString(i));//这种方法也能整型转字符
            }

            i++;
        }

        return list;
    }
}