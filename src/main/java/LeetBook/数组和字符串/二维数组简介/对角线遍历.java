package LeetBook.数组和字符串.二维数组简介;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/25
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 对角线遍历 {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            if (mat == null || mat.length == 0 || mat[0].length == 0) {
                return new int[0];
            }
            int m, n, i, j;
            m = mat.length;
            n = mat[0].length;
            i = 0;
            j = 0;
            int index = 0;
            boolean direction = true;
            int[] ret = new int[m * n];
            while (index < n * m) {
                if (direction) {
                    while (i >= 0 && j < n) {
                        ret[index] = mat[i][j];
                        i--;
                        j++;
                        index++;
                    }
                    if (j == n) {
                        j--;
                        i += 2;
                    } else {
                        i++;
                    }
                } else {
                    while (j >= 0 && i < m) {
                        ret[index] = mat[i][j];
                        i++;
                        j--;
                        index++;
                    }
                    if (i == m) {
                        j += 2;
                        i--;
                    } else {
                        j++;
                    }
                }
                direction = !direction;
            }
            return ret;
        }
    }
}
