package 每日一题;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/28
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 数组序号转换 {
    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            list.sort(Comparator.comparingInt(a -> a));
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>(list.size());
            int indexFlag = 0;
            for (Integer integer : list) {
                if (!integerIntegerHashMap.containsKey(integer)) {
                    integerIntegerHashMap.put(integer, indexFlag++);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = integerIntegerHashMap.get(arr[i]) + 1;
            }
            return arr;
        }
    }
}
