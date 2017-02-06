package com.ds.stack;

import java.util.Stack;

/**
 * Created by u6042192 on 13-Jan-17.
 */
public class InfixToPostfixConverter {
    Stack stack=new Stack();

    public int getPrecedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

    public boolean isOperator(char ch){

        if(ch=='/'||ch=='*'||ch=='+'||ch=='-')
            return true;
        return false;
    }
    public String toPostfix(String infix){
        String postfix=null;
        for(int i=0;i<infix.length();++i){
            char scan=infix.charAt(i);
            //if operator
            if(isOperator(scan)){
                while(!stack.empty() && getPrecedence(stack.peek().toString().charAt(0))>=getPrecedence(scan)){
                    char ch=stack.pop().toString().charAt(0);
                    postfix=postfix+Character.toString(ch);
                }
                stack.push(scan);

            }else{//if operand
                //if postfix is not empty then apppend  else (for the first time assign)
                if(postfix!=null)
                postfix=postfix+Character.toString(scan);
                else
                    postfix=Character.toString(scan);
            }
            //if parser reaches to the end and if stack is not empty, the append everything from stack to postfix
            if(i==infix.length()-1  && !stack.empty()){
                while(!stack.empty())
                    postfix=postfix+stack.pop().toString();
            }

        }
        return postfix;
    }

    public static void main(String[] args) {
        String infix="a+b*c";
        System.out.println(new InfixToPostfixConverter().toPostfix(infix));
    }
}
