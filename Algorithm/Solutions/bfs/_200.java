package bfs;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一个（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */
public class _200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int nr = grid.length;
        int nc = grid[0].length;
        int isLands = 0;
        //将搜索到的为1的岛屿都重置为0
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    isLands++;
                    grid[r][c] = '0';
                    Deque<Integer> queue = new LinkedList<>();
                    queue.add(r * nc + c); //这样写就是为了接下来获取当前行和列方便
                    while (!queue.isEmpty()) {
                        Integer id = queue.poll();
                        int row = id / nc;
                        int col = id % nc;
                        //移动的方向可以是上下左右并且是在不越界的前提下
                        if (row + 1 < nr && grid[row + 1][col] == '1') {
                            queue.add((row + 1) * nc + col);
                            grid[row + 1][col] = '0';
                        }
                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            queue.add((row - 1) * nc + col);
                            grid[row - 1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            queue.add(row * nc + (col - 1));
                            grid[row][col - 1] = '0';
                        }
                        if (col + 1 < nc && grid[row][col + 1] == '1') {
                            queue.add(row * nc + (col + 1));
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }
        }
        return isLands;
    }
}
