class Solution {
    // 直接调用 api的方法
    public String replaceSpace(String s) {
        String newStr = s.replace(" ", "%20");
        return newStr;
    }

    // 老老实实进行字符串拼接
    public String replaceSpace_2(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                sb.append(chars[i]);
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}