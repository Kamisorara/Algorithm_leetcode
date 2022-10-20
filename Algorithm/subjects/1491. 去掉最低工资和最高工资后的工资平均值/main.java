class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (salary[i] != max && salary[i] != min) {
                sum += salary[i];
            }
        }
        return (double) sum / (n - 2);
    }
}