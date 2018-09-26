package com.company.leetcode3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int curLen = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                curLen++;
                map.put(s.charAt(i), i);
            } else {
                int removeCount = remove(map, map.get(s.charAt(i)));
                curLen -= removeCount;
                map.put(s.charAt(i), i);
                curLen++;
            }

            if (curLen > maxLen) {
                maxLen = curLen;
            }
        }

        return maxLen;
    }

    private int remove(Map<Character, Integer> map, int above) {
        int removeCount = 0;
        for (Iterator<Integer> it = map.values().iterator(); it.hasNext(); ) {
            if(it.next() <= above) {
                removeCount++;
                it.remove();
            }
        }
        return removeCount;
    }

}