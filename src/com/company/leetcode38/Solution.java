package com.company.leetcode38;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public String countAndSay(int n) {
        String[] pre = new String[] { "1" };
        List<String> next = new ArrayList<>();

        while (n > 1) {
            String item = pre[0];
            int count = 1;
            for (int i = 1; i < pre.length; i++) {
                if (item.equals(pre[i])) {
                    count++;
                } else {
                    next.add(String.valueOf(count));
                    next.add(item);
                    item = pre[i];
                    count = 1;
                }
            }
            next.add(String.valueOf(count));
            next.add(item);
            pre = next.stream().toArray(String[]::new);
            next = new ArrayList<>();
            n--;
        }
        return String.join("", pre);
    }
}