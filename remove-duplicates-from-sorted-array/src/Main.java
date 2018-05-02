public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,4,5,5,5};
        int[] nums2 = {};
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        for(int i = 0;i<nums.length;i++){
//            nums[i] = sc.next();
//        }
//        System.out.println(java.util.Arrays.toString(nums));


        Solution handler = new Solution();
        System.out.println(handler.removeDuplicates(nums1));
//      输出该数组
//      System.out.println(java.util.Arrays.toString(nums));
    }
}
