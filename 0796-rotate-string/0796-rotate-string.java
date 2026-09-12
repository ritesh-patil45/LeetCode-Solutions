class Solution {
    public boolean rotateString(String s1, String s2) {
        int s1l = s1.length();
        int s2l = s2.length();
        if(s1l != s2l) return false;
        s1 += s1;
        if(s1.contains(s2)){
            return true;
        }
        return false;
    }
}