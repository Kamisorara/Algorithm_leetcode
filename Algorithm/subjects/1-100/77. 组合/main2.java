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
        // 可以对 for 循环进行剪枝
        // n 为最大程度, k为目标长度, size为当前以选取的长度
        for (int i = index; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            traceBack(i + 1, n, k, path);
            // 回溯 (递归到最下面一层后开始走下面这一步，开始回溯)
            path.remove(path.size() - 1);
        }
    }
}