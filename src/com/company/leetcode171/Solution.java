package com.company.leetcode171;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        for(int i = 0; i < 26; i++) {
            map.put((char)('A' + i), i + 1);
        }
    }

    public int titleToNumber(String s) {
        int len = s.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += map.get(s.charAt(i)) * Math.pow(26, len - i - 1);
        }
        return res;
    }
}