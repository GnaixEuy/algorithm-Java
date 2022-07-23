package 算法入门.第三天;

import java.util.HashMap;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/23
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 两数之和_II_输入有序数组 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>(numbers.length);
            for (int i = 0; i < numbers.length; i++) {
                if (hashMap.containsKey(target - numbers[i])) {
                    return new int[]{hashMap.get(target - numbers[i])+1, i+1};
                }else {
                    hashMap.put(numbers[i],i);
                }
            }
            return new int[]{};
        }
    }
}
