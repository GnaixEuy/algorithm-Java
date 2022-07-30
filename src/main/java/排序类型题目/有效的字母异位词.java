package 排序类型题目;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/30
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 有效的字母异位词 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] ch = new int[24];
            for (int i = 0; i < s.length(); i++) {
                ch[s.charAt(i) - 'a']++;
                ch[t.charAt(i) - 'a']--;
            }
            for (int i : ch) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
