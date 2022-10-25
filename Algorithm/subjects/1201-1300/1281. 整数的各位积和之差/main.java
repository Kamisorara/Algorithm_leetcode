class Solution {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int product = 1;
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            int num = Integer.parseInt(String.valueOf(chars[i]));
            product *= num;
            sum += num;
        }
        return product - sum;
    }
}