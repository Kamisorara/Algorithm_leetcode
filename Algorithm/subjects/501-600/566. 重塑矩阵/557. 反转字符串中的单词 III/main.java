class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] sChars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != ' ' && i != n - 1) {
                temp.append(sChars[i]);
            }else {
                if (i == n - 1) {
                    temp.append(sChars[i]);
                }
                String tempS = temp.toString();
                StringBuilder t2 = new StringBuilder();
                int tempSLength =  tempS.length();
                for (int j = tempSLength - 1; j >= 0; j--) {
                    t2.append(tempS.charAt(j));
                }
                sb.append(t2.toString());
                if (i != n - 1) {
                    sb.append(" ");
                }
                temp = new StringBuilder();
            }
        }
        return sb.toString();
    }
}