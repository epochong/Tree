package oj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangchong
 * @date 2019/5/30 19:09
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class LeetCode_144_PreOrder {
    List<Integer> list = new ArrayList <>();
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
