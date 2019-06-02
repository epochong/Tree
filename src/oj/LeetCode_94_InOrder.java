package oj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangchong
 * @date 2019/5/30 19:31
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class LeetCode_94_InOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    static List<Integer> list = new ArrayList <>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(inorderTraversal(new TreeNode(1)));
    }
}
