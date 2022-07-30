package 排序类型题目;

import java.util.Arrays;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/30
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 多数元素 {
    class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int sum = 0;
            int flg = -1;
            for (int num : nums) {
                if (num != flg) {
                    flg = num;
                    sum = 1;
                } else {
                    sum++;
                }
                if (sum > n / 2) {
                    return num;
                }
            }
            return 0;
        }
    }
}
