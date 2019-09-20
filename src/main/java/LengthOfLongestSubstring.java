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

        if (s == null || s.length() == 0) {
            return 0;
        }

        //start为子字符串其实索引
        int start = 0;
        int length = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>(16);
        for (int end = 0; end < length; end++) {
            if (map.containsKey(s.charAt(end))) {
                start=Math.max(start,map.get(s.charAt(end)));
            }
            //put时需要+1，因为 end 从0开始 end代表子字符串结束的索引
            map.put(s.charAt(end),end+1);
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println("i = " + i);
    }
}