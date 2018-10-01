package com.company.leetcode36;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();

	    char[][] board = new char[][] {
                new char[] { '5','3','.','.','7','.','.','.','.' },
                new char[] { '6','.','.','1','9','5','.','.','.' },
                new char[] { '.','9','8','.','.','.','.','6','.' },
                new char[] { '8','.','.','.','6','.','.','.','3' },
                new char[] { '4','.','.','8','.','3','.','.','1' },
                new char[] { '7','.','.','.','2','.','.','.','6' },
                new char[] { '.','6','.','.','.','.','2','8','.' },
                new char[] { '.','.','.','4','1','9','.','.','5' },
                new char[] { '.','.','.','.','8','.','.','7','9' }
        };

        System.out.println(solution.isValidSudoku(board));
    }
}
