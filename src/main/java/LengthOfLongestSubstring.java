package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhudiwei
 * @description
 * @date 2019/9/18 10:01
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * "pwwkew"   3
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        //非空判断
        if (s == null || s.length() == 0) {
            return 0;
        }

        int strLength = s.length();
        int start = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>(8);
        for (int end = 0; end < strLength; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)));
            }
            //如果当前字符在HashMap中不存在，就向HashMap中放入该字符
            // key用该字符，value用当前索引+1
            map.put(s.charAt(end), end + 1);
            //最大不重复子字符串的长度就是 end-start+1
            //+1是因为：当start和end都在0上时，end-start是0，但实际字符串长度是1
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println("i = " + i);
    }
}