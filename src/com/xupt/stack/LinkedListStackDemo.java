package com.xupt.stack;

import java.util.Scanner;

/**
 * @Author: 王文
 * @Date: 2020/4/15 15:47
 * @Version: 1.0
 * @Description:
 */

public class LinkedListStackDemo {
    public static void main(String[] args) {
       LinkedListStack linkedListStack=new LinkedListStack();
        String key = "";
        boolean loop = true; //控制是否退出菜单
        Scanner scanner = new Scanner(System.in);

        while(loop) {
            System.out.println("show: 表示显示栈");
            System.out.println("exit: 退出程序");
            System.out.println("push: 表示添加数据到栈(入栈)");
            System.out.println("pop: 表示从栈取出数据(出栈)");
            System.out.println("请输入你的选择");
            key = scanner.next();
            switch (key) {
                case "show":
                    linkedListStack.list();
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    linkedListStack.push(value);
                    break;
                case "pop":
                    try {
                        HeroNode res = linkedListStack.pop();
                        System.out.printf("出栈的数据是 %d\n", res.no);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }

        System.out.println("程序退出~~~");
    }
}

class LinkedListStack{
   private HeroNode head=new HeroNode(0);
    //栈空
    public boolean isEmpty(){
        return head.next==null;
    }
    //入栈-push
    public void push(int value){
        HeroNode heroNode=new HeroNode(value);
        HeroNode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=heroNode;
    }
    //出栈
    public  HeroNode pop(){
        if (isEmpty()){
            //抛出异常
            throw  new RuntimeException("栈空");
        }
        HeroNode temp=head;
        HeroNode top=head;
        int a=0;
        while (temp.next!=null){
            temp=temp.next;

            if (a!=0){
                top=top.next;
            }
            a++;
        }
        top.next=null;
        return temp;
    }
    //遍历栈
    public void list(){
        if (isEmpty()){
            System.out.println("栈空");
            return;
        }
        HeroNode temp=head;
       while (temp.next!=null){
           System.out.println(temp.next);
           temp=temp.next;
       }
    }

}
class HeroNode {
    public int no;
    public HeroNode next; //指向下一个节点
    //构造器
    public HeroNode(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                '}';
    }
}