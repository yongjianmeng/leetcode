package com.company.leetcode412;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> results = solution.fizzBuzz(1);
        for (String result : results) {
            System.out.println(result);
        }
    }
}
