package homework20;

/**
 * Author: lisiyu
 * Created: 2019/12/1
 */

// 判断一棵树是否是平衡二叉树 ----- 力扣 110
    // 给定一个二叉树，判断它是否是高度平衡的二叉树。
    // 本题中，一棵高度平衡二叉树定义为：
    // 一个二叉树 每个节点 的左右两个子树的高度差的绝对值不超过 1 。

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        // 1. 如果是空树，就算平衡
        if (root == null) {
            return true;
        }
        // 2. 如果没有子树，也算平衡
        if (root.left == null && root.right == null) {
            return true;
        }
        // 3. 求左右子树的高度，判断差值是否 <= 1
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth - rightDepth > 1 || rightDepth - leftDepth < 1) {
            return false;
        }
        // 4. 递归判定左右子树是否平衡
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}
