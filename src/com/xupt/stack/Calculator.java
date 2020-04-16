package com.xupt.stack;

import com.sun.org.apache.bcel.internal.generic.POP;

/**
 * @Author: 王文
 * @Date: 2020/4/15 21:37
 * @Version: 1.0
 * @Description:
 */

public class Calculator {
    public static void main(String[] args) {
        String expression = "1+2*6-4";
        //创建两个栈，一个数栈，一个符号栈
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operSatck = new ArrayStack2(10);

        //定义需要的相关变量
        int index = 0;//用于扫描
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';//将每次扫描得到的char保存到ch中
        //开始while循环扫描
        while (true) {
            //依次得到expression的每一个字符
            ch = expression.substring(index, index + 1).charAt(0);
            //判断ch是什么
            if (operSatck.isOper(ch)) {//如果是运算符
                //判断当前的符号栈是否为空
                if (!operSatck.isEmpty()) {
                    //处理
                    //如果符号栈有操作符，就进行比较,如果当前的操作符的优先级小于或者等于栈中的操作符，
                    // 就需要从数栈中pop出两个数,在从符号栈中pop出一个符号，进行运算，将得到结果，入数栈，然后将当前的操作符入符号栈，
                    if (operSatck.priority(ch) <= operSatck.priority(operSatck.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operSatck.pop();
                        res = numStack.cal(num1, num2, oper);
                        //把运算的结果入数栈
                        numStack.push(res);
                        //将当前的操作符入符号栈
                        operSatck.push(ch);
                    } else {
                        //如果为空直接入栈。。
                        // 如果当前的操作符的优先级大于栈中的操作符， 就直接入符号栈.
                        operSatck.push(ch);
                    }
                }
                else{
                    //如果为空直接入栈。。
                    // 如果当前的操作符的优先级大于栈中的操作符， 就直接入符号栈.
                    operSatck.push(ch);
                }
            }else {
                //如果我们发现是一个数字, 就直接入数栈
                numStack.push(ch - 48);
            }
            //让index加1,并且判断是否到了最后
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        //当表达式扫描完毕，就顺序的从 数栈和符号栈中pop出相应的数和符号，并运行
        while (true) {
            //如果符号栈为空，则计算到最后的结果
            if (operSatck.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operSatck.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        System.out.printf("表达式是%s=%d", expression, numStack.pop());
    }
}

//先创建一个栈，直接使用前面创建好的
//定义一个类ArraySatck 表示栈
class ArrayStack2 {
    private int maxSize; //栈的大小
    private int[] stack; //数组，数组模拟栈，数据放在该数组中
    private int top = -1;  //top表示栈顶，初始化为-1

    //构造器
    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    //可以返回当前栈的值
    public int peek() {
        return stack[top];
    }

    //判断栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈-push
    public void push(int value) {
        //先判断栈是否满了
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈
    public int pop() {
        //先判断是否栈空
        if (isEmpty()) {
            //抛出异常
            throw new RuntimeException("栈空");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //遍历栈
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    //返回运算符的优先级，优先级程序员确定，优先级使用数字表示
    //数字越大，优先级越高
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;//运算符只有 +，-，* ，/
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //计算方法
    public int cal(int num1, int num2, int oper) {
        int res = 0;//res用于存放计算的结果
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '/':
                res = num2 / num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            default:
                break;
        }
        return res;
    }
}
