import java.util.LinkedList;

class CQueue {

    LinkedList<Integer> queue1;

    public CQueue() {
        queue1 = new LinkedList<>();
    }

    public void appendTail(int value) {
        queue1.addLast(value);
    }

    public int deleteHead() {
        return queue1.size() == 0 ? -1 : queue1.removeFirst();
    }
}
/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */