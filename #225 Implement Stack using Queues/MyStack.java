package com.practice;

public class MyStack {
    
    private Integer[] elements;
    private int flag; //back的位置
    /** Initialize your data structure here. */
    public MyStack() {
        //初始化长度
        this.elements = new Integer[5];
        this.flag = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(elements.length > flag){
            elements[flag] = x;
        }else{
            //数组已满的情况
            Integer[] elementsNew = new Integer[elements.length+5];
            System.arraycopy(elements, 0, elementsNew, 0, elements.length);
            elementsNew[flag] = x;
        }
        flag++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(flag > 0){
            int top = elements[flag-1];
            flag = flag -1;
            return top;
        }else{
            return 0;
        }
    }
    
    /** Get the top element. */
    public int top() {
        if(flag > 0){
            return elements[flag-1];
        }else{
            return 0;
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return flag == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
