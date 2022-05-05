import java.util.Deque;
import java.util.LinkedList;

public class _1823 {
    /**
     * 1823. 找出游戏的获胜者
     */
    public int findTheWinner(int n, int k) {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.getFirst();
    }
}
