class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int i = 0;
        int ans = 0;
        int count = 0;
        while(i < n){
            if(s.charAt(i) == '('){
                count++;
            }
            else if(s.charAt(i) == ')'){
                ans = Math.max(ans, count);
                count--;
            }
            i++;
        }
        return ans;
    }
}