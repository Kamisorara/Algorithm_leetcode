class Solution {
    public List<String> buildArray(int[] target, int n) {
        int m = target.length;
        List<String> res = new ArrayList<>();
        for (int i = 1, j = 0; i <= n && j < m; i++) {
            res.add("Push");
            if (target[j] != i) {
                res.add("Pop");
            } else {
                j++;
            }
        }
        return res;
    }
}