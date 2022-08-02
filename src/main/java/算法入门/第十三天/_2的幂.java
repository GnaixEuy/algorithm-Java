package 算法入门.第十三天;

import java.util.HashSet;
import java.util.Set;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/8/2
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class _2的幂 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            Set<Long> set = new HashSet<>(32);
            for (int i = 0; i < 32; i++) {
                set.add((long) Math.pow(2, i));
            }
            if (n < 1) {
                return false;
            } else if (n == 1) {
                return true;
            }
            return set.contains(Long.parseLong(String.valueOf(n)));
        }
    }
}
