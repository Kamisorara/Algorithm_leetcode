class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int missCount = 0, lastMiss = -1, ptr = 0, current = 1;
        for (missCount = 0; missCount < k; current++) {
            if (current == arr[ptr]) {
                ptr = (ptr + 1 < arr.size()) ? ptr + 1 : ptr;
            } else {
                missCount++;
                lastMiss = current;
            }
        }
        return lastMiss;
        
    }
};