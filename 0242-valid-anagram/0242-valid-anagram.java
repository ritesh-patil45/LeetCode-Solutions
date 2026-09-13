class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;
        char[] ss = new char[n];
        char[] st = new char[m];
        for(int i=0 ; i<n ; i++){
            ss[i] = s.charAt(i);
            st[i] = t.charAt(i);
        }
        Arrays.sort(ss);
        Arrays.sort(st);
        if(Arrays.equals(ss, st)){
            return true;
        }
        return false;
    }
}