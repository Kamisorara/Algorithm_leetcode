class Solution {
public:
// 执行超时
    vector<vector<string>> mostPopularCreator(vector<string> &creators, vector<string> &ids, vector<int> &views) {
        // 返回
        vector<vector<string>> res;
        unordered_map<string, int> hashmap;
        int n = creators.size();
        for (int i = 0; i < n; ++i) {
            if (hashmap.find(creators[i]) == hashmap.end()) {
                hashmap[creators[i]] = views[i];
            } else {
                hashmap[creators[i]] += views[i];
            }
        }

        vector<string> names;
        vector<int> totalViews;

        for (auto & it : hashmap) {
            names.push_back(it.first);
            totalViews.push_back(it.second);
        }

        // 找出多个最大值如果只有一个就找一个
        int maxVal = totalViews[0];
        for (int i = 0; i < names.size() - 1; ++i) {
            maxVal = max(maxVal, totalViews[i + 1]);
        }

        // 先添加名字
        for (int i = 0; i < names.size(); ++i) {
            if (totalViews[i] == maxVal) {
                vector<string> temp(2);
                temp[0] = names[i];
                res.push_back(temp);
            }
        }

        //再添加id
        for (auto & re : res) {
            vector<int> index;
            int k = 0;

            for (int j = 0; j < creators.size(); ++j) {
                if (creators[j] == re[0]) {
                    index.push_back(j);
                }
            }

            // 找到下标之后 就在 id 和 views 里面寻找最小的字典序
            string tempId = ids[index[0]];
            for (int j = 0; j < index.size() - 1; ++j) {
                if (views[index[j]] > views[index[j + 1]]) {
                    tempId = ids[index[j]];
                } else if (views[index[j]] == views[index[j + 1]]) {
                    if (ids[index[j]] < ids[index[j + 1]]) {
                        tempId = ids[index[j]];
                    }
                }
            }
            re[1] = tempId;
        }
        return res;
    }
};