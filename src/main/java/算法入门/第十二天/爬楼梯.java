package 算法入门.第十二天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/8/1
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 爬楼梯 {
    class Solution {
        public int climbStairs(int n) {
            int p = 0;
            int q = 0;
            int r = 1;
            for (int i = 0; i < n; i++) {
                p = q;
                q = r;
                r = p + q;
            }
            return r;
        }
    }
}
