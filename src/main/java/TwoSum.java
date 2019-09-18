package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhudiwei
 * @description
 * @date 2019/9/17 22:07
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //要求 a+b=target  所以，只要(target-当前遍历的i)所对应的key存在，就把索引复制给数组元素
            //   {-10,7,19,15}    target=9
            if (map.containsKey(target - nums[i])) {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-10, 7, 19, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}
