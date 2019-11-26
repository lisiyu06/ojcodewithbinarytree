package homework20;

/**
 * Author: lisiyu
 * Created: 2019/11/26
 */

// 力扣 572 ----- 另一个树的子树
    // 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    // s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

public class IsSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 递归
        // 比较 s 是否包含 t
        // 和 t 是不是相等 + s.left 是不是包含 t + s.right 是不是包含 t

        // 1. 如果两个树都是空树，直接返回 true
        if (s == null && t == null) {
            return true;
        }
        // 2. 如果一个树为空，一个不为空，false
        if (s == null || t == null) {
            return false;
        }
        // 3. 如果两个树都非空
        // a) 比较
    }
}
