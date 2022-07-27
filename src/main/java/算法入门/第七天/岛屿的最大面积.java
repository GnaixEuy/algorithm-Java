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
public class 岛屿的最大面积 {
    class Solution {

        public int maxAreaOfIsland(int[][] grid) {
            int size = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    size = Math.max(size, this.dfs(grid, i, j));
                }
            }
            return size;
        }

        private int dfs(int[][] grid, int x, int y) {
            if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length) {
                if (grid[x][y] == 1) {
                    grid[x][y] = 0;
                    int ans = 1;
                    ans += dfs(grid, x - 1, y);
                    ans += dfs(grid, x, y - 1);
                    ans += dfs(grid, x + 1, y);
                    ans += dfs(grid, x, y + 1);
                    return ans;
                } else {
                    return 0;
                }
            }
            return 0;
        }
    }
}
