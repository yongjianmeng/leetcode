package com.company.leetcode66;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            result[i] = digits[i];
        }
        result[digits.length - 1] += 1;

        boolean flag = false;
        for (int i = result.length - 1; i >= 0; i--) {
            int itemPlusOne = result[i];
            if (flag) {
                itemPlusOne += 1;
            }
            if (itemPlusOne > 9) {
                result[i] = itemPlusOne - 10;
                flag = true;
            } else {
                result[i] = itemPlusOne;
                flag = false;
                break;
            }
        }
        if (flag) {
            int[] result2 = new int[result.length + 1];
            result2[0] = 1;
            for (int i = 1; i < result2.length; i++) {
                result2[i] = result[i - 1];
            }
            return result2;
        } else {
            return result;
        }
    }
}