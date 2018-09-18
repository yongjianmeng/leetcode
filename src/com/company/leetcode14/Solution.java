package com.company.leetcode14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int index = 0;
        while(true) {
            char first;
            if (strs[0].length() < index + 1) {
                break;
            }
            first = strs[0].charAt(index);

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < index + 1) {
                    return result.toString();
                } else if (strs[i].charAt(index) != first)
                    return result.toString();
            }
            result.append(first);
            index++;
        }

        return result.toString();
    }
}