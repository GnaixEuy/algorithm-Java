package 算法入门.第六天;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/26
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 无重复字符的最长子串 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0, start = 0;
            for (int end = 0; end < s.length(); end++) {
                char ch = s.charAt(end);
                if (map.containsKey(ch)) {
                    start = Math.max(map.get(ch) + 1, start);
                }
                max = Math.max(max, end - start + 1);
                map.put(ch, end);
            }
            return max;
        }
    }
}
