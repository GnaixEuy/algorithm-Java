package LeetBook.数组和字符串;

import java.util.*;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/23
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 合并区间 {
    class Solution {
        //贪心思想
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            ArrayList<Object> objects = new ArrayList<>();
            int[] tmp = intervals[0];
            for (int i = 1; i < intervals.length; i++) {
                if (tmp[1] >= intervals[i][0]){
                    tmp[1] = Math.max(tmp[1],intervals[i][1]);
                }else {
                    objects.add(tmp);
                    tmp = intervals[i];
                }
            }
            //长度为0情况
            objects.add(tmp);
            return objects.toArray(new int[objects.size()][2]);
        }
    }
}
