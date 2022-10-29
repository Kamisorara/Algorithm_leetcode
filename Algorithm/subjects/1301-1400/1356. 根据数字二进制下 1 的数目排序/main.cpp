class Solution {
public:
    int get(int x) {
        int n = 0;
        while (x) {
            n += (x % 2);
            x /= 2;
        }
        return n;
    }

    vector<int> sortByBits(vector<int>& arr) {
        vector<int> numsIndex(10001, 0);
        for (auto x: arr) {
            numsIndex[x] = get(x);
        }
        // 自定义排序规则
        sort(arr.begin(), arr.end(), [&](int x, int y){
            if (numsIndex[x] < numsIndex[y]) {
                return true;
            }
            if (numsIndex[x] > numsIndex[y]) {
                return false;
            }
            return x < y;
        });
        return arr;
    }   
};  