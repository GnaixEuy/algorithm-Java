package 算法入门.第七天;

/**
 * <img src="http://blog.gnaixeuy.cn/wp-content/uploads/2022/06/bug.png"/>
 *
 * <p>项目： algorithm-java </p>
 *
 * @author GnaixEuy
 * @date 2022/7/27
 * @see <a href="https://github.com/GnaixEuy"> GnaixEuy的GitHub </a>
 */
public class 图像渲染 {
    /**
     * DFS 或者 BFS
     */
    class Solution {
        private final int[] dx = {-1, 1, 0, 0};
        private final int[] dy = {0, 0, -1, 1};

        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int oldColor = image[sr][sc];
            if (oldColor != color) {
                dfs(image, sr, sc, oldColor, color);
            }
            return image;
        }

        private void dfs(int[][] image, int x, int y, int oldColor, int newColor) {
            if (image[x][y] == oldColor) {
                image[x][y] = newColor;
                for (int i = 0; i < 4; i++) {
                    int mx = x + dx[i], my = y + dy[i];
                    if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
                        dfs(image, mx, my, oldColor, newColor);
                    }
                }
            }
        }
    }
}
