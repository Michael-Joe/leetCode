/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/maximum-depth-of-binary-tree
 * Title: 104. 二叉树的最大深度
 *
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(solution.generateTest()));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }


    public TreeNode generateTest() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        return root;
    }
}