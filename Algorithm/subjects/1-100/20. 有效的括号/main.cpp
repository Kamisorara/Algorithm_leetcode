#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        int n = s.size();
        if (n % 2 == 1) {
            return false;
        }
        stack<char> stacks;
        unordered_map<char, char> map = {
            {')','('},
            {']','['},
            {'}','{'}
        };
            
        for (int i = 0; i < n; i++) {
            if (map.count(s[i])) {
                if (stacks.empty() || stacks.top() != map[s[i]]) {
                    return false;
                }
                stacks.pop();
            } else {
                stacks.push(s[i]);
            }
        }
        return stacks.empty();
    }
};