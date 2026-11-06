class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i < n){
            char c = s.charAt(i);
            int ascii = (int)c + 32;
            if(ascii <= 122 && ascii >= 97){
                char a = (char)ascii;
                ans.append(a);
            }
            else{
                ans.append(c);
            }
            i++;
        }
        return ans.toString();
    }
}