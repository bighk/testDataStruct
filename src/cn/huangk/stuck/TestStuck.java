
package cn.huangk.stuck;

import java.util.Stack;

public class TestStuck {
    public static void main(String[] args) {
        Stack  stack = new Stack<>();
        StuckX stuck = new StuckX();
        try {
            stuck.push("a");
            stuck.push("b");
            stuck.push("c");
            stuck.push("d");
            stuck.push("e");
            stuck.push("f");
            stuck.push("g");
            stuck.push("h");
            stuck.push("i");
            stuck.push("j");
            stuck.push("k");
        } catch (OutOfSizeException e) {
            //e.printStackTrace();
        }
        String tmp = (String) stuck.peek();

        System.out.println(tmp);
        while (!stuck.isEmpty()) {
            String obj = (String) stuck.pop();
            System.out.println(obj);
        }
    }
}
