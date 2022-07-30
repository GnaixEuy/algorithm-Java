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
public class 合并两个有序数组 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
            for (int i : nums1) {
                System.out.println(i);
            }
            Arrays.sort(nums1);
        }
    }
}
