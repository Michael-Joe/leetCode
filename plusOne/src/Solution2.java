/*
 * 注：使用ArrayList倒序，+1后，排除进位操作，再放到新数组
 * 注：使用ArrayList的原因是因为可以方便的增加数组长度
 */

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();

        for (int i = digits.length - 1; i >= 0; i--) {
            list.add(digits[i]);
        }

        list.set(0, list.get(0) + 1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 10) {
                if (i == list.size() - 1) {
                    list.set(i, 0);
                    list.add(1);
                } else {
                    list.set(i + 1, list.get(i + 1) + 1);
                    list.set(i, 0);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
            result[i] = list.get(j);
        }

        return result;
    }
}
