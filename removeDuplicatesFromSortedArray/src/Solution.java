class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i]) {
                nums[++len] = nums[i + 1];
            }
        }

        return len + 1;
    }
}
