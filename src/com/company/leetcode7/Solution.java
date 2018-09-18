package com.company.leetcode7;

class Solution {

    private char[] positiveMax = {'2', '1', '4', '7', '4', '8', '3', '6', '4', '7'};
    private char[] negativeMax = {'2', '1', '4', '7', '4', '8', '3', '6', '4', '8'};

    public int reverse(int x) {
        String xStr = String.valueOf(x);

        boolean isNegative = xStr.startsWith("-");

        if (isNegative) {
            xStr = xStr.substring(1);
        }

        xStr = new StringBuilder(xStr).reverse().toString();

        if (isOverflow(isNegative, xStr)) {
            return 0;
        } else {
            return isNegative ? Integer.valueOf("-" + xStr) : Integer.valueOf(xStr);
        }
    }

    public boolean isOverflow (boolean isNegative, String xStr) {
        if (xStr.length() < 10) {
            return false;
        }

        if (xStr.length() > 10) {
            return true;
        }

        char[] max = isNegative ? negativeMax : positiveMax;

        for (int i = 0; i < max.length; i++) {
            if (xStr.charAt(i) > max[i]) {
                return true;
            } else if (xStr.charAt(i) < max[i]) {
                return false;
            }
        }
        return false;
    }
}