package 算法入门.第四天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/24
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 反转字符串 {

    class Solution {
        public void reverseString(char[] s) {
            for (int i = 0, j = s.length - 1; i < s.length >> 1; i++, j--) {
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
            }
        }
    }

}
