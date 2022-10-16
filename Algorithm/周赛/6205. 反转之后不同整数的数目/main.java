class Solution {
    public int countDistinctIntegers(int[] nums) {
        List<String> strList = new ArrayList<>();
        for (int k : nums) {
            strList.add(String.valueOf(k));
        }
        for (int num : nums) {
            String strNum = String.valueOf(num);
            if (strNum.length() == 1) {
                strList.add(strNum);
            } else {
                char[] chars = strNum.toCharArray();
                StringBuilder temp = new StringBuilder();
                for (int j = chars.length - 1; j >= 0; j--) {
                    temp.append(chars[j]);
                }
                strList.add(temp.toString());
            }
        }
        Set<Integer> set = new HashSet<>();
        for (String s : strList) {
            set.add(Integer.parseInt(s));
        }
        return set.size();
    }
}