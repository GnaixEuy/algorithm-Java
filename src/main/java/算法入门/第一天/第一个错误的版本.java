package 算法入门.第一天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/21
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 第一个错误的版本 {
    /**
     * The isBadVersion API is defined in the parent class VersionControl.
     * boolean isBadVersion(int version);
     */
    static class VersionControl {
        boolean isBadVersion(int version) {
            return true;
        }
    }

    class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int i, j;
            for (i = 0, j = n; i < j; ) {
                int flg = i + (j - i) >> 1;
                if (isBadVersion(flg)) {
                    j = flg;
                } else {
                    i = flg + 1;
                }
            }
            return i;
        }
    }
}
