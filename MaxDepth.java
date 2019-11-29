package homework20;

/**
 * Author: lisiyu
 * Created: 2019/11/29
 */

// 力扣104 ----- 二叉树的最大深度
    // 给定一个二叉树，找出其最大深度。
    // 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    // 说明: 叶子节点是指没有子节点的节点。

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        // 递归
        // root 的深度 ==> 1 + 左子树的深度 和 右子树的深度 的最大值
        // 1. 如果是空树，深度就是 0
        if (root == null) {
            return 0;
        }
        // 2. 如果只有一个根节点，没有左右子树，深度就是 1
        if (root.left == null && root.right == null) {
            return 1;
        }
        // 3. 1 + max (左子树的深度， 右子树的深度)
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}
