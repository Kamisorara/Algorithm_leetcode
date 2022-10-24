class MyQueue {

private:
    stack<int> input, output;

    void helper() {
        while (!input.empty()) {
            output.push(input.top());
            input.pop();
        }
    }
public:

    MyQueue() {}

    void push(int x) {
        input.push(x);
    }
    
    int pop() {
        if (output.empty()) {
            helper();
        }
        int num = output.top();
        output.pop();
        return num;
    }
    
    int peek() {
        if (output.empty()) {
            helper();
        }
        return output.top();
    }
    
    bool empty() {
        return output.empty() && input.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */