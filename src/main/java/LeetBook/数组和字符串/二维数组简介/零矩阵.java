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
public class 零矩阵 {
    class Solution {
        public void setZeroes(int[][] matrix) {
            boolean[] row = new boolean[matrix.length];
            boolean[] column = new boolean[matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        row[i] = true;
                        column[j] = true;
                    }
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (row[i] || column[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
