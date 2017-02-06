package com.ds.stack;

import java.util.Stack;

/**
 * Created by u6042192 on 17-Jan-17.
 */
public class InfixToPostfixConverterExtended {
    String postfix=null;
    public String toPostfix(String infix){
        Stack stack=new Stack();
        String postfix=null;
        for(int i=0;i<infix.length();++i){
            char scan=infix.charAt(i);
            //if operator
            if(isOperator(scan)){
                while(!stack.empty() && getPrecedence(stack.peek().toString().charAt(0))>=getPrecedence(scan) && scan!= '('){
                    char ch=stack.pop().toString().charAt(0);
                    postfix=postfix+Character.toString(ch);
                }
                stack.push(scan);

            }
            else if(scan=='('){
                stack.push('(');
            }
            else if(scan==')'){
                while(stack.peek().toString().charAt(0)!='('){
                    char ch=stack.pop().toString().charAt(0);
                    postfix+=Character.toString(ch);

                }
                stack.pop();
            }
            else{//if operand
                //if postfix is not empty then apppend  else (for the first time assign)
                if(postfix!=null)
                    postfix=postfix+Character.toString(scan);
                else
                    postfix=Character.toString(scan);
            }
            //if parser reaches to the end and if stack is not empty, the append everything from stck to postfix
            if(i==infix.length()-1  && !stack.empty()){
                while(!stack.empty())
                    postfix=postfix+stack.pop().toString();
            }

        }
        return postfix;
    }
    public boolean isOperator(char ch){
        if(ch=='+' || ch=='-' || ch=='/' || ch=='*')
            return true;
        return false;
    }
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
    public String evaluatePostfix(String postfix){
        Stack stack=new Stack();
        for(int i=0;i<postfix.length();i++){
            char scan =postfix.charAt(i);
            if(isOperator(scan)){
                int a=Integer.parseInt(stack.pop().toString());
                int b=Integer.parseInt(stack.pop().toString());
                stack.push(operate(a,b,scan));
            }else{
                stack.push(scan);
            }
        }
        return stack.pop().toString();
    }
    public int operate(int op1,int op2,char ch){
        if(ch=='+')
            return op1+op2;
        if(ch=='-')
            return op1-op2;
        if(ch=='/')
            return op1/op2;
        if(ch=='*')
            return op1*op2;
        return 0;
    }
    public static void main(String[] args) {
        String infix="(1+2)*(3+4)";
       InfixToPostfixConverterExtended converter= new InfixToPostfixConverterExtended();
        String postfix=converter.toPostfix(infix);
        System.out.println("postfix = "+postfix);
        System.out.println(converter.evaluatePostfix(postfix));
    }
}
