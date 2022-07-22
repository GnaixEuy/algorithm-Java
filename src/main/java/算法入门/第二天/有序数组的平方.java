package 算法入门.第二天;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/22
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 有序数组的平方 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            LinkedList<Integer> integers = new LinkedList<>();
            for (int num : nums) {
                integers.add(num*num);
            }
            integers.sort(Comparator.comparingInt(e->e));
            return integers.stream().mapToInt(i -> i).toArray();
        }
    }
}
