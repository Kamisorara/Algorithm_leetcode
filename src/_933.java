import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 933. 最近的请求次数
 */
public class _933 {
    Queue<Integer> queue;

    public void RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();

    }
}
