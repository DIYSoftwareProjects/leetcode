package done.array;

import java.util.*;
import java.lang.*;

public class _49_Group_Anagrams {
    public static void main(String[] args) {
        String[] strs1 = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = new String[]{""};
        String[] strs3 = new String[]{"a"};

        System.out.println("strs1 : " + groupAnagrams(strs1));
        System.out.println("strs2 : " + groupAnagrams(strs2));
        System.out.println("strs3 : " + groupAnagrams(strs3));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (Character ch : s.toCharArray())
                ca[ch - 'a']++;
            String key = String.valueOf(ca);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}