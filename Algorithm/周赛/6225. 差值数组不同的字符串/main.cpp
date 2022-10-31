class Solution {
public:
    string oddString(vector<string> &words) {
        int n = words[0].size();
        int length = words.size();
        vector<vector<int>> difference(length);
        for (int i = 0; i < length; i++) {
            string s1 = words[i];
            for (int j = 0; j < n - 1; ++j) {
                int temp = s1[j + 1] - s1[j];
                difference[i].push_back(temp);
            }
        }


        int differenceSize = difference.size();
        int itemSize = difference[0].size();
        bool stillOK = true;

        vector<int> item1 = difference[0];
        vector<int> item2 = difference[1];


        if (item1 != item2) {
            stillOK = false;
        }
 

        for (int i = 2; i < differenceSize; ++i) {
            for (int j = 0; j < itemSize; ++j) {
                if (difference[i][j] != item1[j] && !stillOK) {
                    return words[0];
                } else if (difference[i][j] != item1[j] && stillOK) {
                    return words[i];
                } else if (difference[i][j] != item2[j] && !stillOK) {
                    return words[1];
                }
            }
        }


        return words[0];
    }
};