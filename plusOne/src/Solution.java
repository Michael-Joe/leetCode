/*
 * 注：该方法只考虑进位，若第一位产生进位，则必定是9……9的格式，那么直接重置数组为原长度+1，且第一位置为1即可
 */
class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 10 && i != 0) {
                digits[i] = 0;
                digits[i - 1]++;
            } else if (digits[i] == 10 && i == 0) {
                digits = new int[digits.length + 1];//重置数组，因为第一位产生进位，则后面位必为0；
                digits[0] = 1;
            } else
                break;
        }
        return digits;

    }

}