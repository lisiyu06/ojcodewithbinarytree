package homework20;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: lisiyu
 * Created: 2019/12/4
 */

// 判断一棵树是不是完全二叉树

public class IsComplete {
    public boolean isComplete(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 1. 先对树进行层序遍历
        // 如果这个标记为 false, 说明还是处在第一阶段
        // 如果这个标记为 true , 接下来的节点就不能有子树
        // 也就是第二阶段开始了
        boolean needNoChild = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            // 对这个元素的情况进行判定了.
            // 访问是一组比较复杂的判断
            if (!needNoChild) {
                // 第一阶段的情况
                if (cur.left != null && cur.right != null) {
                    // 合格的状态，继续往下遍历
                    // 把左右子树加入队列即可
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    // 这种情况一定不是完全二叉树
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    // 这是临界状态, 开启第二阶段
                    queue.offer(cur.left);
                    needNoChild = true;
                } else {
                    // 左右子树都为空, 开启第二阶段
                    needNoChild = true;
                }
            } else {
                // 第二阶段的情况
                // 第二阶段要求节点必须没有子树. 只要子树存在, 就不是完全二叉树
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            } //end if
        } // end while
        return true;
    }
}
