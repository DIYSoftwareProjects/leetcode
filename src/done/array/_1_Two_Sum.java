package done.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public static void main(String[] args) {
        int[] nums1 = new int[] {2, 7, 11, 15};
        int[] nums2 = new int[] {3, 2, 4};

        System.out.println("nums1 : " + Arrays.toString(twoSum(nums1, 9)));
        System.out.println("nums2 : " + Arrays.toString(twoSum(nums2, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
