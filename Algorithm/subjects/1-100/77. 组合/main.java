class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        traceBack(1, n, k, path);
        return res;
    }

    void traceBack(int index, int n,int k, List path) {
        // 终止条件
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        // 横向循环
        for (int i = index; i <= n; i++) {
            path.add(i);
            traceBack(i + 1, n, k, path);
            // 回溯
            path.remove(path.size() - 1);
        }
    }
}