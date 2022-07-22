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
public class 搜索插入位置 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int i, j;
            int ans = 0;
            for (i = 0, j = nums.length - 1; i <= j;) {
                int ret = i + ((j - i) >> 1);
                if (target <= nums[ret]) {
                    ans = ret;
                    j = ret;
                } else {
                    i = ret + 1;
                }
            }
            return ans;
        }
    }
}
