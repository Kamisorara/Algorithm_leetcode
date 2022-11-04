class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        for (auto i = arr.begin(); i != arr.end(); i++) {
            for (auto j = arr.begin(); j != arr.end(); j++) {
                if (i != j && *i * 2 == *j) return true;
            }
        }
        return false;
    }
};
