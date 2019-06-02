package oj;

/**
 * @author wangchong
 * @date 2019/5/30 19:52
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class LeetCode_606_Tree2Str {

     public class TreeNode {
      int val;
          TreeNode left;
        TreeNode right;
         TreeNode(int x) { val = x; }
     }
    public String tree2str(TreeNode t) {
         StringBuilder res = new StringBuilder();
         tree2str(t,res);
         return String.valueOf(res);
    }
    private void tree2str(TreeNode node, StringBuilder res) {
         if (node == null) {
             return;
         }
         res.append(node.val);
         if (node.left != null) {
             res.append("(");
             tree2str(node.left,res);
             res.append(")");
         } else {
             if (node.right != null) {
                 res.append("()");
             }
         }
         if (node.right != null) {
             res.append("(");
             tree2str(node.right,res);
             res.append(")");
         }
    }
}
