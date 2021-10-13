import java.util.HashMap;
import java.util.Map;

public class longestString {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int first = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        if (length <= 0) {
            return length;
        }
        for (int last = 0; last < length; last++) {
            char target = s.charAt(last);
            if (map.containsKey(target)) {
                first = Math.max(first, map.get(target) + 1);
            }
            map.put(target, last);
            max = Math.max(max, last - first + 1);
        }
        System.out.println(map);
        return max;
    }


    public static void main(String[] args) {
        String s = "tmmzuxt";
        longestString log = new longestString();
        int count = log.lengthOfLongestSubstring(s);
        System.out.println(count);
    }
}
