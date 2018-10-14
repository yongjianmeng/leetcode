package com.company.leetcode118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        if (numRows == 0) {
            return results;
        }
        // first row.
        List<Integer> _1stRow = new ArrayList<>();
        _1stRow.add(1);
        results.add(_1stRow);
        if (numRows == 1) {
            return results;
        }
        // second row.
        List<Integer> _2ndRow = new ArrayList<>();
        _2ndRow.add(1);
        _2ndRow.add(1);
        results.add(_2ndRow);
        if (numRows == 2) {
            return results;
        }

        List<Integer> preRow = _2ndRow;
        List<Integer> curRow = new ArrayList<>();
        for (int i = 3; i <= numRows; i++) {
            curRow.add(1);
            for (int j = 0; j < preRow.size() - 1; j++) {
                curRow.add(preRow.get(j) + preRow.get(j + 1));
            }
            curRow.add(1);
            results.add(curRow);
            preRow = curRow;
            curRow = new ArrayList<>();
        }
        return results;
    }
}