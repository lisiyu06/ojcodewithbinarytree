package homework20;

/**
 * Author: lisiyu
 * Created: 2019/11/25
 */

// 力扣 100 -----相同的树
// 给定两个二叉树，编写一个函数来检验它们是否相同。
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 递归
        // 判定两个树相同 ==> 比较根节点是否相同 + 比较左子树是否相同 + 比较右子树是否相同
        // 1. 如果两棵树都是空树，直接返回 ture
        if (p == null && q == null) {
            return true;
        }
        // 2. 如果两棵树一个为空，一个不为空，直接返回 false
        if (p == null || q == null) {
            return false;
        }
        // 3. 如果两棵树都不为空
        // a) 比较根节点是否相同，若不相同，就直接返回 false
        if (p.val != q.val) {
            return false;
        }
        // b) 再递归比较左子树和右子树
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
