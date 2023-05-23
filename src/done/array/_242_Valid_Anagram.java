package done.array;

import java.util.*;

public class _242_Valid_Anagram {
    public static void main(String[] args) {
        System.out.println("TRUE : " + isAnagram("anagram", "nagaram"));
        System.out.println("FALSE : " + isAnagram("rat", "car"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Character ch : map.keySet()) {
            if (map.get(ch) != 0)
                return false;
        }

        return true;
    }
}
