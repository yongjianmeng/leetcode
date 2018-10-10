package com.company.leetcode229;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int num1 = nums[0], num2 = nums[0], cnt1 = 0, cnt2 = 0;
        for (int num : nums) {
            if (num == num1) {
                cnt1++;
            } else if (num == num2) {
                cnt2++;
            } else if (cnt1 == 0) {
                num1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                num2 = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == num1) {
                cnt1++;
            } else if (num == num2) {
                cnt2++;
            }
        }
        if (cnt1 > nums.length / 3) {
            res.add(num1);
        }
        if (cnt2 > nums.length / 3) {
            res.add(num2);
        }
        return res;
    }
}
