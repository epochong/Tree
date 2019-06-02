package BinTree;

/**
 * @author wangchong
 * @date 2019/5/27 21:07
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public  interface BinTree<E> {

    boolean add(E e);
    int size();
    E getMax();
    E getMin();
    boolean contains(E e);
}
