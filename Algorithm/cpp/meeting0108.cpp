#include <bits/stdc++.h>

using namespace std;

class Solution {
    /**
     * 面试题 01.08. 零矩阵
     * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
     * 标记法
     */
public:
    void setZeroes(vector<vector<int>> &matrix) {
        int rowLength = matrix.size();
        int colLength = matrix[0].size();
        vector<int> row(rowLength), col(colLength);
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (!matrix[i][j]) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
};
