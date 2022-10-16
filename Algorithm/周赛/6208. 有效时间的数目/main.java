class Solution {
    public int countTime(String time) {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                count += String.format("%02d:%02d", i, j).matches(time.replace("?", "\\d")) ? 1 : 0;
            }
        }
        return count;
    }
}