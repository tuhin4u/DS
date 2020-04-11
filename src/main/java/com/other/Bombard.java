package com.other;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by U6042192 on 09-Feb-17.
 */
public class Bombard {
    public static String processBomard(String s) {
        boolean flag = false;
        Deque<String> deque = new ArrayDeque<String>();
        String resultStr = "";

        for (int i = 0; i < s.length(); i++) {
            flag = false;
            for (int j = 0; j < s.length(); j++) {
                //frm size =3
                if (deque.size() < 3) {
                    //ie queue is not empty the check with the peek, if both peek and the element are same then offer the element into queue
                    if (!deque.isEmpty()) {
                        if (deque.peek().equals(s.charAt(j) + "")) {
                            deque.offer(s.charAt(j) + "");
                        } else {
                            resultStr += deque.poll();
                            deque.offer(s.charAt(j) + "");
                        }
                    } else {
                        deque.offer(s.charAt(j) + "");
                    }
                } else {
                    while (!deque.isEmpty())
                        deque.poll();
                    deque.offer(s.charAt(j) + "");
                    flag = true;
                }
            }
            while (!deque.isEmpty()) {
                resultStr += deque.poll();
            }
            if (s.equals(resultStr)) {
                return resultStr;
            }
            if (flag == true) {
                i = 0;
                s = resultStr;
                resultStr = "";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "aaabcccdee";
        String str = processBomard(s);

        System.out.println(str);
    }
}
