class Solution {
    public boolean isHappy(int n) {
        String s = String.valueOf(n);
        // 直接判断一百次 反正不是就是不是了
        for (int k = 0; k < 100; k++) {
            int length = s.length();
            int result = 0;
            for (int i = 0; i < length; i++) {
                result += (Integer.parseInt(String.valueOf(s.charAt(i))) * Integer.parseInt(String.valueOf(s.charAt(i))));
            }
            if (result == 1) {
                return true;
            } else {
                s = String.valueOf(result);
                result = 0;
            }
        }
        return false;
    }
}