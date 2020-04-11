package com.ds.stack;

import java.util.Stack;

/**
 * Check for balanced parentheses in an expression
 */
public class CheckBalancedParanthesis {
    public boolean check(String str){
        Stack stack=new Stack();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);

            if(ch==')' || ch=='}' || ch==']'){
                char sym=stack.peek().toString().charAt(0);
                if(revBraces(stack.peek().toString().charAt(0))==ch){
                    stack.pop();
                }
            }
        }
        if(stack.empty())
            return true;

        return  false;
    }
    public char revBraces(char ch){
        char c=	'\u0000';
        if(ch=='(') c=')';
        else if(ch=='{') c='}';
        else if(ch=='[') c=']';

        return  c;

    }

    public static void main(String[] args) {
        String str="{[()]}";
        boolean b=new CheckBalancedParanthesis().check(str);
        System.out.println(str+" isBalanced = "+b);

    }
}
