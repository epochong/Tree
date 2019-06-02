package oj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangchong
 * @date 2019/5/30 21:07
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class LeetCode_100_TwoTreeIsEqual {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
         String str0 = serialByPre(p);
         String str1 = serialByPre(q);
         if (str0.equals(str1)) {
             return true;
         } else {
             return false;
         }
     }

    /**
     * 先序序列化
     * @param head
     * @return
     */
    public static String serialByPre(TreeNode head) {
        if (head == null) {
            return "#!";
        }
        //当前字符串
        String res = head.val + "!";
        res += serialByPre(head.left);
        res += serialByPre(head.right);
        return res;
    }
}
