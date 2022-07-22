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
public class 二分查找 {
    class Solution {
        public int search(int[] nums, int target) {
            for (int i = 0, j = nums.length-1; i<=j; ) {
                int flg = (i+j)>>1;
                System.out.println(flg);
                if (nums[flg] == target){
                    return flg;
                }else if (nums[flg] > target){
                    j = flg-1;
                }else {
                    i = flg+1;
                }
            }
            return -1;
        }
    }
}
