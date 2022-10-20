class MinStack {

    //创建链表头
    private ListNode head;

    //压栈 (就是添加新的头节点)
    public void push(int val) {
        //首先判断链表是否为空
        if (isEmpty()) {
            head = new ListNode(val, val, null);
        } else {
            //创建新的头节点
            head = new ListNode(val, Math.min(head.min, val), head);
        }
    }

    //出栈 (相当于把链表头删除)
    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空...");
        }
        head = head.next;
    }

    //获取栈顶
    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空...");
        }
        return head.val;
    }

    // 链表的头节点保存的min是整个链表的最小值
    public int getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("栈为空...");
        }
        return head.min;
    }

    //判断栈是否为空
    private boolean isEmpty() {
        return head == null;
    }

    // 自定义一个链表类
    class ListNode {
        public int val;
        public int min;//最小值
        public ListNode next;

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */