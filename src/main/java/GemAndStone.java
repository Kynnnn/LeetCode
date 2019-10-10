package main.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/10 10:15
 */
public class GemAndStone {
    public static int numJewelsInStones(String J, String S) {

        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "bbbbbbAAAAa";
        int i = numJewelsInStones(a, b);
        System.out.println(i);
    }
}