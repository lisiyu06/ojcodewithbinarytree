package homework20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: lisiyu
 * Created: 2019/12/3
 */

// 二叉树的层次遍历 ----- 力扣 102
    // 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        // 创建一个队列辅助进行遍历
        Queue<TreeNode> queue = new LinkedList<>();
        // 1. 先把 root 插入队列
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 2. 循环取队首元素. 访问这个元素.
                TreeNode cur = queue.poll();
                arr.add(cur.val);
                // 3. 把当前这个队首元素左子树和右子树都插入队列中.
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(arr);
        }
        return ret;
    }
}
