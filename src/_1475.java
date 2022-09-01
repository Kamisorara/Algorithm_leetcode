public class _1475 {
    /**
     * 1475. 商品折扣后的最终价格
     */
    public int[] finalPrices(int[] prices) {
        int arrLength = prices.length;
        int[] ans = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            int discount = 0;
            for (int j = i + 1; j < arrLength; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            ans[i] = prices[i] - discount;
        }
        return ans;
    }
}
