package com.xupt.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: 王文
 * @Date: 2020/4/16 16:21
 * @Version: 1.0
 * @Description:
 */

public class PolandNotation {
    public static void main(String[] args) {
        //定义一个逆波兰表达式
        //（3+4)*5-6 =>3 4 +5 *6 -
        String suffixExpression="30 4 + 5 * 6 - ";
        //思路
        //1.先将"3 4 + 5 * 6 - " =》放到ArrayList中
        //2. 将ArrayList 传递给一个方法，配合栈完成计算
        List<String> list=getListString(suffixExpression);
        System.out.println(list);


        int res=calculate(list);
        System.out.println(res);

    }
    //将逆波兰表达式依次放入到ArrayList中
    public static List<String> getListString(String suffixExpression){
        //将suffixExpression分隔符
        String[] s = suffixExpression.split(" ");
        List<String> list=new ArrayList<String>();
        for (String s1 : s) {
            list.add(s1);
        }
        return list;
    }
    //完成对逆波兰表达式的运算
	/*
	 * 1)从左至右扫描，将3和4压入堆栈；
		2)遇到+运算符，因此弹出4和3（4为栈顶元素，3为次顶元素），计算出3+4的值，得7，再将7入栈；
		3)将5入栈；
		4)接下来是×运算符，因此弹出5和7，计算出7×5=35，将35入栈；
		5)将6入栈；
		6)最后是-运算符，计算出35-6的值，即29，由此得出最终结果
	 */

    public static int calculate(List<String> ls) {
        // 创建给栈, 只需要一个栈即可
        Stack<String> stack=new Stack<String>();
        //遍历
        for (String s : ls) {
            //使用正则表达式
            if (s.matches("\\d+")){
                stack.push(s);
            }else{
                //pop出两个数，并运算，在入栈
                int num2=Integer.parseInt(stack.pop());
                int num1=Integer.parseInt(stack.pop());
                int res=0;
                if (s.equals("+")){
                    res=num1+num2;
                }else if (s.equals("-")){
                    res=num1-num2;
                }else if (s.equals("/")){
                    res=num1/num2;
                }else if (s.equals("*")){
                    res=num1*num2;
                }else{
                    throw  new RuntimeException("没有这个运算符");
                }
                stack.push(res+"");
            }

        }
        return Integer.parseInt(stack.pop());
    }
}
