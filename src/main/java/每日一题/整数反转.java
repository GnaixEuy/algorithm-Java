package 每日一题;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/8/13
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 整数反转 {
    class Solution {
        public int reverse(int x) {
            boolean negative = false;
            if (x == 0) {
                return 0;
            }
            StringBuilder stringBuffer = new StringBuilder(String.valueOf(x));
            if (stringBuffer.charAt(0) == '-') {
                negative = true;
                stringBuffer.deleteCharAt(0);
            }
            stringBuffer.reverse();
            for (int i = 0; i < stringBuffer.length(); i++) {
                char c = stringBuffer.charAt(i);
                if (c != '0') {
                    break;
                }
                stringBuffer.deleteCharAt(i);
                i--;
            }
            long l = Long.parseLong(stringBuffer.toString());
            if (l > Integer.MAX_VALUE) {
                return 0;
            }
            return Integer.parseInt(stringBuffer.toString()) * (negative ? -1 : 1);
        }
    }
}
