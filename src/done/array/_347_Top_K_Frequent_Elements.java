package done.array;

import java.util.*;

public class _347_Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 1, 1, 2, 2, 3};
        int[] nums2 = new int[] {1};

        System.out.println("nums1 : " + Arrays.toString(topKFrequent(nums1, 2)));
        System.out.println("nums2 : " + Arrays.toString(topKFrequent(nums2, 1)));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequenceMap = new HashMap<>();
        for (int n : nums)
            frequenceMap.put(n, frequenceMap.getOrDefault(n, 0) + 1);

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int key : frequenceMap.keySet()) {
            int frequency = frequenceMap.get(key);
            map.putIfAbsent(frequency, new ArrayList<>());
            map.get(frequency).add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = nums.length; i >= 0 && res.size() != k; i--)
            if (map.containsKey(i))
                res.addAll(map.get(i));

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class _128_Longest_Consecutive_Sequence {
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
}