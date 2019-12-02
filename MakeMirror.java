package homework20;

/**
 * Author: lisiyu
 * Created: 2019/12/2
 */

// 求二叉树的镜像

public class MakeMirror {
    public TreeNode makeMirror(TreeNode root) {
        // 遍历 + 交换左右子树
        if (root == null) {
            return null;
        }
        // 交换就是此处的“访问”操作
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        makeMirror(root.left);
        makeMirror(root.right);
        return root;
    }
}
