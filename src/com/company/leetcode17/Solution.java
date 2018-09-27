package com.company.leetcode17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private static Map<Integer, Character[]> map = new HashMap<>();

    static {
        map.put(2, new Character[] { 'a', 'b', 'c' });
        map.put(3, new Character[] { 'd', 'e', 'f' });
        map.put(4, new Character[] { 'g', 'h', 'i' });
        map.put(5, new Character[] { 'j', 'k', 'l' });
        map.put(6, new Character[] { 'm', 'n', 'o' });
        map.put(7, new Character[] { 'p', 'q', 'r', 's' });
        map.put(8, new Character[] { 't', 'u', 'v' });
        map.put(9, new Character[] { 'w', 'x', 'y', 'z' });
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        int[] digitNums = new int[digits.length()];
        int resultLen = 1;
        for (int i = 0; i < digitNums.length; i++) {
            digitNums[i] = Integer.valueOf(digits.charAt(i)) - 48;
            resultLen *= map.get(digitNums[i]).length;
        }

        List<String> results = new ArrayList<>(resultLen);
        for (int i = 0; i < resultLen; i++) {
            results.add("");
        }

        for (int i = 0; i < digitNums.length; i++) {
            int split = resultLen / map.get(digitNums[i]).length;

            if (split != 1) {
                Character[] chars = map.get(digitNums[i]);
                int times = results.size() / resultLen;
                for (int z = 0; z < times; z++) {
                    int base = 0 + resultLen * z;
                    for (Character character : chars) {
                        for (int j = 0; j < split; j++) {
                            results.set(j + base, results.get(j + base) + character);
                        }
                        base += split;
                    }
                }
            } else {
                Character[] chars = map.get(digitNums[i]);
                for (int j = 0; j < results.size(); j++) {
                    results.set(j, results.get(j) + chars[j % chars.length]);
                }
            }
            resultLen = split;
        }

        return results;

    }
}