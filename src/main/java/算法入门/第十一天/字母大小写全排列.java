package 算法入门.第十一天;

import java.util.ArrayList;
import java.util.List;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/31
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 字母大小写全排列 {
    class Solution {
        public List<String> letterCasePermutation(String S) {
            List<StringBuilder> ans = new ArrayList<>();
            ans.add(new StringBuilder());
            for (char c : S.toCharArray()) {
                int n = ans.size();
                if (Character.isLetter(c)) {
                    for (int i = 0; i < n; ++i) {
                        ans.add(new StringBuilder(ans.get(i)));
                        ans.get(i).append(Character.toLowerCase(c));
                        ans.get(n + i).append(Character.toUpperCase(c));
                    }
                } else {
                    for (int i = 0; i < n; ++i) {
                        ans.get(i).append(c);
                    }
                }
            }
            List<String> finalAns = new ArrayList<>();
            for (StringBuilder sb : ans) {
                finalAns.add(sb.toString());
            }
            return finalAns;
        }
    }
}
