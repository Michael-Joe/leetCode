/*
 * 注：造一个char型数组来遍历，最后调用String.copyValueOf()方法重新组装成字符串
 */
class Solution {
    public String reverseString(String s) {
        char ch[] = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return String.copyValueOf(ch);
        //return new String(ch);//这个方法也可以返回字符串
    }
}