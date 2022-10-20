class Solution {
    public List<String> generateParenthesis(int n) {
        // 可以使用暴力枚举
        List<String> res = new ArrayList<>();
        generator(new char[2 * n], 0, res);
        return res;
    }

    public void generator(char[] chars, int pos, List<String> list) {
        // 递归创建括号
        //如果括号的长度到了就进行括号的平衡性进行比对
        if (chars.length == pos) {
            if (valid(chars)) {
                //比对通过就把这个括号组合添加至res中
                list.add(new String(chars));
            }
        } else {
            //递归创建
            generator(chars, pos + 1, list);
            chars[pos] = '(';
            generator(chars, pos + 1, list);
            chars[pos] = ')';
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char ch : current) {
            if (ch == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}