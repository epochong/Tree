package BinTree.impl;

import BinTree.BinTree;

/**
 * @author wangchong
 * @date 2019/5/27 21:11
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class BinarySearchTree<E extends Comparable<E>> implements BinTree<E> {
    private int size = 0;
    private Node root = null;
    private class Node {
        E data;
        Node left;
        Node right;

        public Node(E data) {
            this.data = data;
        }
    }

    @Override
    public boolean add(E e) {
        root = add(root,e);
        return false;
    }

    private Node add(Node node, E e) {
        if (node == null) {
            Node newNode = new Node(e);
            size++;
            return newNode;
        }
        if (e.compareTo(node.data) < 0) {
            node.left = add(node,e);
        }
        if (e.compareTo(node.data) > 0) {
            node.right = add(node,e);
        }
        return node;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E getMax() {
        return null;
    }

    @Override
    public E getMin() {
        return null;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }


}
