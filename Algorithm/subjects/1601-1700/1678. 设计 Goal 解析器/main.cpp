class Solution {
public:
    string interpret(string command) {
        int n = command.size();
        queue<char> q;
        for (int i = 0; i < n; i++) {
            q.push(command[i]);
        }
        string res = "";
        while(!q.empty()) {
            char a = q.front();
            if (a == 'G') {
                q.pop();
                res += 'G';
            } else if (a == '(') {
                q.pop();
                if (q.front() == ')') {
                    q.pop();
                    res += 'o';
                } else if (q.front() == 'a') {
                    q.pop();
                    q.pop();
                    q.pop();
                    res += "al";
                }
            }
        }
        return res;
    }
};