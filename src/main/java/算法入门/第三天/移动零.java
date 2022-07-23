package 算法入门.第三天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/23
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 移动零 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int flg = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0){
                    nums[flg] = nums[i];
                    flg++;
                }
            }
            for (int i = flg; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
