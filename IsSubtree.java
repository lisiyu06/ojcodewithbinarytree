package homework20;

/**
 * Author: lisiyu
 * Created: 2019/11/26
 */

// 力扣 572 ----- 另一个树的子树
    // 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    // s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

public class IsSubtree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

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
        // a) 比较根节点的值是不是相等，如果相等的话，
        //    比较一下 s 和 t 是不是相同的树，如果是相同的树，就认为是包含的
        boolean ret = false;
        if (s.val == t.val) {
            ret = isSametree(s, t);
        }
        // b) 递归判定，t 是否被 s 的左子树包含
        if (!ret) {
            ret = isSubtree(s.left, t);
        }
        // c) 递归判定，t 是否被 s 的右子树包含
        if (!ret) {
            ret = isSubtree(s.right, t);
        }
        return ret;
    }

    public boolean isSametree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSametree(p.left, q.left) && isSametree(p.right, q.right);
    }
}
