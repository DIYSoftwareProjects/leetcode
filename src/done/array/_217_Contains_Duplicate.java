package done.array;

import java.util.*;

public class _217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 3, 1};
        int[] nums2 = new int[] {1, 2, 3, 4};

        System.out.println("nums1 : " + containsDuplicate(nums1));
        System.out.println("nums2 : " + containsDuplicate(nums2));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }

        return false;
    }
}
