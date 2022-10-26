class Solution {
public:
    bool haveConflict(vector<string>& event1, vector<string>& event2) {
        auto getMinute = [](string t){
            return stoi(t.substr(0, 2)) * 60 + stoi(t.substr(3, 4));
        };

        int low = max(getMinute(event1[0]), getMinute(event2[0]));
        int heigh = min(getMinute(event1[1]), getMinute(event2[1]));
        return low <= heigh;
    }
};