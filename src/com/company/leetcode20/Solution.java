package com.company.leetcode20;

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item == '{' || item == '[' || item == '(') {
                stack.push(item);
            } else {
                if (stack.size() > 0) {
                    char itemToCheck = (Character)stack.pop();
                    if (!isEqual(itemToCheck, item)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (stack.size() > 0) {
            return false;
        }

        return true;
    }

    private boolean isEqual (char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        }
        if (left == '[' && right == ']') {
            return true;
        }
        if (left == '{' && right == '}') {
            return true;
        }
        return false;
    }
}