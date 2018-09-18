package com.company.leetcode13;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private static Map<String, Integer> symbolOrder = new HashMap<>();

    private static Map<String, Integer> symbolValueMap = new HashMap<>();

    static {
        symbolOrder.put("I", 1);
        symbolOrder.put("V", 2);
        symbolOrder.put("X", 3);
        symbolOrder.put("L", 4);
        symbolOrder.put("C", 5);
        symbolOrder.put("D", 6);
        symbolOrder.put("M", 7);

        symbolValueMap.put("I", 1);
        symbolValueMap.put("V", 5);
        symbolValueMap.put("X", 10);
        symbolValueMap.put("L", 50);
        symbolValueMap.put("C", 100);
        symbolValueMap.put("D", 500);
        symbolValueMap.put("M", 1000);
        symbolValueMap.put("IV", 4);
        symbolValueMap.put("IX", 9);
        symbolValueMap.put("XL", 40);
        symbolValueMap.put("XC", 90);
        symbolValueMap.put("CD", 400);
        symbolValueMap.put("CM", 900);
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            String currentItem = String.valueOf(s.charAt(i));
            if ((i + 1) < s.length()) {
                String nextItem = String.valueOf(s.charAt(i + 1));
                int currentItenOrder = symbolOrder.get(currentItem);
                int nextItemOrder = symbolOrder.get(nextItem);
                if (currentItenOrder < nextItemOrder) {
                    result += symbolValueMap.get(currentItem + nextItem);
                    i++;
                } else {
                    result += symbolValueMap.get(currentItem);
                }
            } else {
                result += symbolValueMap.get(currentItem);
            }
        }
        return result;
    }
}
