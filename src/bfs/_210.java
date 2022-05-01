package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 210. 课程表 II
 * 现在你总共有 numCourses 门课需要选，记为 0 到 numCourses - 1。给你一个数组 prerequisites ，其中 prerequisites[i] = [ai, bi] ，表示在选修课程 ai 前 必须 先选修 bi 。
 * <p>
 * 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示：[0,1] 。
 * 返回你为了学完所有课程所安排的学习顺序。可能会有多个正确的顺序，你只要返回 任意一种 就可以了。如果不可能完成所有课程，返回 一个空数组 。
 */
public class _210 {
    //存储有向图
    List<List<Integer>> edges;
    //存储存储每个节点的入读
    int[] inDegree;
    //存储答案（返回的结果）
    int[] result;
    //答案的下标
    int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //使用bfs来解决
        edges = new ArrayList<>();
        //先将有向图初始化
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        index = 0;
        inDegree = new int[numCourses];
        result = new int[numCourses];
        //存储有向图
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            ++inDegree[info[0]];
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        // 将所有入度为 0 的节点放入队列中
        for (int i = 0; i < numCourses; ++i) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            // 从队首取出一个节点
            int u = queue.poll();
            // 放入答案中
            result[index++] = u;
            for (int v : edges.get(u)) {
                --inDegree[v]; //把后面的入度减1然后继续接下来的操作
                // 如果相邻节点 v 的入度为 0，就可以选 v 对应的课程了
                if (inDegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }
        if (index != numCourses) {
            return new int[0];
        }
        return result;
    }
}
