/*
 * 注：使用HashMap，用映射来找，降低两次循环的时间复杂度，不过相应增加了空间复杂度
 *     为了取到第一个字符，用到了LinkedList，这里使用的是他的有序这个特征
 */

import java.util.LinkedHashMap;
import java.util.Map;

class Solution3 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> sMap = new LinkedHashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (!sMap.containsKey(c)) {
                sMap.put(c, 1);
            } else {
                sMap.put(c, sMap.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> en : sMap.entrySet()) {
            if (en.getValue() == 1) {
                return s.indexOf(en.getKey().toString());
                //return en.getKey().toString();//该行可以输出第一个不重复的字符
            }
        }

        return -1;
    }
}
