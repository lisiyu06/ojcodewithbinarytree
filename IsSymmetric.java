package homework20;

/**
 * Author: lisiyu
 * Created: 2019/12/1
 */

// 对称二叉树 ----- 力扣 101
    // 给定一个二叉树，检查它是否是镜像对称的。

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        // 1. 如果两个数都是空树，算镜像
        if (t1 == null && t2 == null) {
            return true;
        }
        // 2. 两个数一个为空，有个非空，则不是镜像
        if (t1 == null || t2 == null) {
            return false;
        }
        // 3. 如果两个树都不为空
        //   a) 比较根节点是不是相同，不相同就不是镜像
        if (t1.val != t2.val) {
            return false;
        }
        //   b) 递归比较子树，t1.left 和 t2.right ,
        //      t1.right 和 t2.left 是不是镜像
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
