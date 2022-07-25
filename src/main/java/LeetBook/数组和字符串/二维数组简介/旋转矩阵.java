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
public class 旋转矩阵 {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            //水平翻转
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = matrix[i][j] ^ matrix[n - 1 - i][j];
                    matrix[n - 1 - i][j] = matrix[i][j] ^ matrix[n - 1 - i][j];
                    matrix[i][j] = matrix[i][j] ^ matrix[n - 1 - i][j];
                }
            }

            //对角翻转
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    matrix[j][i] = matrix[j][i] ^ matrix[i][j];
                    matrix[i][j] = matrix[j][i] ^ matrix[i][j];
                    matrix[j][i] = matrix[j][i] ^ matrix[i][j];
                }

            }
        }
    }
}
