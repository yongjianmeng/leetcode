package com.company.leetcode7;

public class Main {

//    Given a 32-bit signed integer, reverse digits of an integer.
//
//    Example 1:
//
//    Input: 123
//    Output: 321
//    Example 2:
//
//    Input: -123
//    Output: -321
//    Example 3:
//
//    Input: 120
//    Output: 21
//    Note:
//    Assume we are dealing with an environment which could only store integers within the 32-bit
//    signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your
//    function returns 0 when the reversed integer overflows.
//

    //  [-2147483648, 2147483647]
    public static void main(String[] args) {
        Solution solution = new Solution();

//        System.out.println(solution.reverse(123));
//        System.out.println(solution.reverse(-123));
//        System.out.println(solution.reverse(120));
//        System.out.println(solution.reverse(120));
//        System.out.println(solution.reverse(0));
//        System.out.println(solution.reverse(2147483647));
//        System.out.println(solution.reverse(-2147483648));
        System.out.println(solution.reverse(-2147483412));
        // 2143847412
//        System.out.println(solution.reverse(-130));
    }
}
