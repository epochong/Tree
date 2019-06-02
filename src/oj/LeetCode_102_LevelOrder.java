package oj;

import java.util.*;

/**
 * @author wangchong
 * @date 2019/6/1 23:47
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class LeetCode_102_LevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static List<List<Integer>> serialByLevel(TreeNode head) {
        List<List<Integer>> lists = new ArrayList <>();
        List<Integer> list = new ArrayList <>();
        list.add(head.val);
        lists.add(list);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            list = new ArrayList <>();
            head = queue.poll();
            if (head.left != null) {
                list.add(head.left.val);
                queue.offer(head.left);
            }
            if (head.right != null) {
                list.add(head.right.val);
                queue.offer(head.right);
            }
            lists.add(list);
        }
        lists.removeIf(i -> i.size() == 0);
        return lists;
    }

}
