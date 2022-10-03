public class _1652 {

    /**
     * 1652. 拆炸弹
     * 使用滑动窗口的方式实现
     */
    public int[] decrypt(int[] code, int k) {
        int codeLength = code.length;
        int[] result = new int[codeLength];
        if (k == 0) return result;
        int sum = 0; //和
        int count = Math.abs(k); //k 有正负两种可能性
        int head = k > 0 ? 0 : codeLength - 1;
        int tail = k > 0 ? 1 : 0;
        //计算第一个窗口的sum 值
        while (count-- > 0) {
            sum += k > 0 ? code[head = (head + 1) % codeLength] : code[tail = (tail - 1 + codeLength) % codeLength];
        }
        //开始移动窗口并计算sum值
        result[0] = sum;
        for (int i = 1; i < codeLength; i++) {
            result[i] = sum + code[++head % codeLength] - code[tail];
            sum = result[i];
            tail = ++tail % hashCode();
        }
        return result;
    }

}
