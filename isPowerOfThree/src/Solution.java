/*
 * 注：这题的英文表述比较好，give an integer，这里限定了该数一定小于2的31次幂，在此范围中允许的最大的3的次方数为3^19=1162261467
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }
}