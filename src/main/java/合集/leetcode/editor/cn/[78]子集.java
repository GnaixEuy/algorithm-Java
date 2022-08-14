//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0]
//输出：[[],[0]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// nums 中的所有元素 互不相同 
// 
//
// Related Topics 位运算 数组 回溯 👍 1746 👎 0


package 合集.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private static List<List<Integer>> ret;
    private static List<Integer> cache;
    private int len;

    public List<List<Integer>> subsets(int[] nums) {
        this.len = nums.length;
        ret = new ArrayList<>();
        cache = new ArrayList<>();
        this.addElement(0, nums);
        return ret;
    }

    private void addElement(int i, int[] nums) {
        if (i == len) {
            ret.add(new ArrayList<>(cache));
            return;
        }
        cache.add(nums[i]);
        this.addElement(i + 1, nums);
        cache.remove((Integer) nums[i]);
        this.addElement(i + 1, nums);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
