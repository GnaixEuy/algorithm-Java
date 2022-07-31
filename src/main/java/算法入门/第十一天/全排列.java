package 算法入门.第十一天;

import java.util.ArrayList;
import java.util.List;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/31
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 全排列 {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            ArrayList<List<Integer>> res = new ArrayList<>();
            if (nums.length == 0) {
                return res;
            }
            List<Integer> path = new ArrayList<>();
            boolean[] user = new boolean[nums.length];
            backtrace(nums, path, 0, user, res);
            return res;
        }

        private void backtrace(int[] nums, List<Integer> list, int depth, boolean[] used, ArrayList<List<Integer>> res) {
            if (depth == nums.length) {
                res.add(new ArrayList<>(list));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                list.add(nums[i]);
                used[i] = true;
                backtrace(nums, list, depth + 1, used, res);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
