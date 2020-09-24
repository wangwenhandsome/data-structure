package com.offer.tree;

import java.util.Stack;

/**
 * @Author: 王文
 * @Date: 2020/9/21 9:11
 * @Version: 1.0
 * @Description:
 */

public class Main {
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




    }
    public static void preTree(TreeNode binTree){
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty()||binTree!=null){
            while (binTree!=null){
                System.out.print(binTree.val+"->>");
                stack.push(binTree);
                binTree=binTree.left;
            }
            if(!stack.isEmpty()){
                binTree=stack.pop();
                binTree=binTree.right;
            }
        }
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
