package done.array;

import java.util.HashSet;
import java.util.Set;

public class _128_Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums1 = new int[] {100, 4, 200, 1, 3, 2};
        int[] nums2 = new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println("nums1 : " + longestConsecutive(nums1));
        System.out.println("nums2 : " + longestConsecutive(nums2));
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (int n : nums)
            set.add(n);

        for (Integer n : set) {
            if (!set.contains(n - 1)) {
                int i = 1;
                while (set.contains(n + i))
                    i++;
                maxLength = Math.max(maxLength, i);
            }
        }
        return maxLength;
    }
}