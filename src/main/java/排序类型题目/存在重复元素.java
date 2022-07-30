package 排序类型题目;

import java.util.HashMap;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/30
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 存在重复元素 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>(nums.length);
            for (int num : nums) {
                if (integerIntegerHashMap.containsKey(num)) {
                    return true;
                } else {
                    integerIntegerHashMap.put(num, 1);
                }
            }
            return false;
        }
    }
}
