package LeetBook.数组和字符串.数组简介;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/23
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 寻找数组的中心索引 {
    class Solution {
        /**
         * 解题思路:
         * 前后缀加上中间数等于数组和，前后缀必须相等，所以直接求2倍前缀加中间数等于和即可
         */
        public int pivotIndex(int[] nums) {
            int sum = Arrays.stream(nums).sum();
            int tmpSum = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((tmpSum << 1) + nums[i] == sum) {
                    return i;
                }
                tmpSum += nums[i];
            }
            return -1;
        }
    }
}
