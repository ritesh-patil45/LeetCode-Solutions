class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int al = strs.length;
        String s1 = strs[0];
        String s2 = strs[al-1];
        int i = 0;
        int n = Math.min(s1.length(), s2.length());
        while(i < n){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        if(i == 0) return "";
        else return s1.substring(0, i);
    }
}