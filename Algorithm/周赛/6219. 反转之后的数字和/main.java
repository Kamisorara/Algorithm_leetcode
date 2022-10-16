class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int divide = num / 2;
        if (num == 0) {
            return true;
        }
        for (int i = 0; i < num; i++) {
            String str = String.valueOf(i);
            StringBuilder temp = new StringBuilder();
            char[] chars = str.toCharArray();
            for (int j = chars.length - 1; j >= 0; j--) {
                temp.append(chars[j]);
            }
            if (i + Integer.parseInt(temp.toString()) == num) {
                return true;
            }
        }
        return false;

    }
}