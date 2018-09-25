package com.company.leetcode139;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(solution.wordBreak("leetcode", wordDict));

//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("apple");
//        wordDict.add("pen");
//        System.out.println(solution.wordBreak("applepenapple", wordDict));

//        List<String> wordDict = new ArrayList<>();
//        wordDict.add("cats");
//        wordDict.add("dog");
//        wordDict.add("san");
//        wordDict.add("and");
//        wordDict.add("cat");
//        System.out.println(solution.wordBreak("catsandog", wordDict));
    }
}
