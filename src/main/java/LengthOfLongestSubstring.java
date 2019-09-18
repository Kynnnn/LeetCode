package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhudiwei
 * @description
 * @date 2019/9/18 10:01
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * "pwwkew"   3
 * left = Math.max(left,map.get(s.charAt(i)) + 1);
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int j = 0;
        Map<Character, Integer> map = new HashMap<>(8);
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j=Math.max();
            }
        }

        return j;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println("i = " + i);
    }
}