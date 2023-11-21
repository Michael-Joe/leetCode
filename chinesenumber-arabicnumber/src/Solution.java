/*
 * Date:  2023.11.21
 * Url:
 * Title: 中文数字转阿拉伯数字
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        testFunc();
//        Solution s = new Solution();
//        System.out.println(s.changeNumber("六千零一十万三千二百五十六"));
    }

    public long changeNumber(String chineseNum) {
        List<Character> unit = Arrays.asList('亿', '万', '千', '百', '十');
        List<Character> uniqUnit = Arrays.asList('亿', '万');
        HashMap<Character, Integer> numberMap = generateNumberMap();

        // 1. 首先处理不含单位的，形如二零一二，直接拼即可
        boolean hasUnit = false;
        char[] chineseArray = chineseNum.toCharArray();
        long result = 0;
        for (char a : chineseArray) {
            hasUnit = unit.contains(a) || hasUnit;
        }
        if (!hasUnit) {
            for (int i = 0; i <= chineseArray.length - 1; i++) {
                result += (long) (numberMap.get(chineseArray[chineseArray.length - 1 - i]) * Math.pow(10, i));
            }
            return result;
        }
        // 2. 单独处理形如“十二”此类
//        if (chineseArray[0] == '十') {
//            if (chineseArray.length>1){
//                return return 10 + chineseArray[1]
//            }
//        }

        // 3. 从右向左，拼普通字符串
        long magnification = 1;
        boolean isBeyondWan = false;
        boolean isBeyondYi = false;
        for (int i = chineseArray.length - 1; i >= 0; i--) {
            if (unit.contains(chineseArray[i])) {
                // 如果当前位为单位位，则继续向左移动一位，计算倍率；
                magnification = (long) magnification * numberMap.get(chineseArray[i]);

                //  这里有个特例，形如“十一”、“十一万”，十虽然是单位位，但同时也是数字位，这种情况仅出现于十为首位的情况
                if (i == 0 && chineseArray[i] == '十') {
                    result += magnification;
                }
                // 标识是否超过万了
                isBeyondWan = chineseArray[i] == '万' || isBeyondWan;
                isBeyondYi = chineseArray[i] == '亿' || isBeyondYi;
            } else {
                // 如果当前位为数字位(包含了0)，则直接乘倍率并初始化倍率位1
                //   这里有一个特例，如两千三，即末尾为数字且前一位为单位位(其实比较极端，属于一种省略读法，谷歌翻译是读成两千三百的)
                if (i == chineseArray.length - 1 && i > 0 && unit.contains(chineseArray[i - 1])) {
                    result += (long) numberMap.get(chineseArray[i]) * numberMap.get(chineseArray[i - 1]) / 10;
                } else {
                    result += numberMap.get(chineseArray[i]) * magnification;
                }
                if (isBeyondYi) {
                    magnification = numberMap.get('亿');
                } else if (isBeyondWan) {
                    magnification = numberMap.get('万');
                } else {
                    // 不过万，需要清空倍率
                    magnification = 1;
                }
            }
        }

        return result;
    }


    public static HashMap<Character, Integer> generateNumberMap() {
        HashMap<Character, Integer> numberMap = new HashMap<>();
        numberMap.put('零', 0);
        numberMap.put('一', 1);
        numberMap.put('二', 2);
        numberMap.put('两', 2);
        numberMap.put('三', 3);
        numberMap.put('四', 4);
        numberMap.put('五', 5);
        numberMap.put('六', 6);
        numberMap.put('七', 7);
        numberMap.put('八', 8);
        numberMap.put('九', 9);
        numberMap.put('十', 10);
        numberMap.put('百', 100);
        numberMap.put('千', 1000);
        numberMap.put('万', 10000);
        numberMap.put('亿', 100000000);
        return numberMap;
    }


    public static void testFunc() {
        Solution a = new Solution();
        String[] testCase = new String[]{"十一万", "十", "十一", "一十一", "零", "一", "三万亿零九百", "一万三千二百五十六", "六千零一十万三千二百五十六", "两千三", "二零一二", "五万五"};
        long[] testCaseResult = new long[]{110000, 10, 11, 11, 0, 1, 3000000000900L, 13256, 60103256, 2300, 2012, 55000};

        for (int i = 0; i < 12; i++) {
            long re = a.changeNumber(testCase[i]);
            System.out.print(re + " ");
            System.out.print(testCaseResult[i] + " ");
            System.out.println(re == testCaseResult[i]);
        }
    }
}