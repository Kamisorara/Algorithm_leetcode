class Solution {
public:
    string interpret(string command) {
        int n = command.size();
        string s = "";
        for (int i = 0; i < n; i++) {
            if (command[i] ==  'G') {
                s.push_back('G');
            } else if (command[i] == '(') {
                if (command[i + 1] == 'a') {
                    s += "al";
                    i += 2;
                } else {
                    s.push_back('o');
                    i++;
                }
            }
        }
        return s;
    }
};