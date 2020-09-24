package com.offer.tree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * @Author: 王文
 * @Date: 2020/9/14 21:57
 * @Version: 1.0
 * @Description:
 */

public class MidTree {
    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)
                node[i].left = node[i*2+1];
            if(i*2+2 < 10)
                node[i].right = node[i*2+2];
        }

        midOrderRe(node[0]);
        System.out.println();
        midOrder(node[0]);
    }

    public static void midOrderRe(TreeNode biTree){
        if (biTree==null){
            return;
        }
        midOrderRe(biTree.left);
        System.out.print(biTree.val+"->");
        midOrderRe(biTree.right);
    }

    public static void midOrder(TreeNode biTree){
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty()||biTree!=null){
            while (biTree!=null){
                stack.push(biTree);
                biTree=biTree.left;
            }
            if (!stack.isEmpty()){
                biTree=stack.pop();
                System.out.print(biTree.val+"->");
                biTree=biTree.right;
            }
        }
    }

}