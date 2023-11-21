/*
 * Date:  2023.11.21
 * Url:   https://leetcode.cn/problems/binary-tree-level-order-traversal
 * Title: 102. 二叉树的层序遍历
 *
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        TreeNode root2 = null;
        TreeNode root3 = new TreeNode(1);
        Solution solution = new Solution();
        System.out.println(solution.levelOrder(root));
        System.out.println(solution.levelOrder(root2));
        System.out.println(solution.levelOrder(root3));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> thisFloor = new ArrayList<>();
            int size = queue.size();
            while (size-- > 0) {
                TreeNode current = queue.poll();
                thisFloor.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(thisFloor);
        }
        return result;
    }
}