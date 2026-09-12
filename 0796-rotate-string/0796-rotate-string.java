class Solution {
    public boolean rotateString(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        String s = new String("");
        s += s1 + s1;
        if(s.contains(s2)){
            return true;
        }
        return false;
    }
}