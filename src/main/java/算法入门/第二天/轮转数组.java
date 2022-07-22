package 算法入门.第二天;

import java.util.LinkedList;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/22
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 轮转数组 {
    class Solution {
        private void reverse(int[] nums, int start, int end) {
            for (int i = start, j = end; i < j; i++, j--) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
        }
    }
}
