package com.company.leetcode36;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[] chars = new char[9];

        // valid rows
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                chars[j] = board[i][j];
            }
            if (!isValid(chars)) {
                return false;
            }
        }

        // valid cols
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                chars[j] = board[j][i];
            }
            if (!isValid(chars)) {
                return false;
            }
        }

        // valid sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                int charIdx = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        chars[charIdx] = board[i + x][j + y];
                        charIdx++;
                    }
                }
                if (!isValid(chars)) {
                    return false;
                }

            }
        }

        return true;
    }

    private boolean isValid(char[] chars) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '.') {
                if (set.contains(chars[i])) {
                    return false;
                }
                set.add(chars[i]);
            }
        }
        return true;
    }
}