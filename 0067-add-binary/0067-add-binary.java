class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        int i = n-1;
        int j = m-1;
        int rem = 0;
        StringBuilder ans = new StringBuilder();
        int x = 0;
        int y = 0;
        int add = 0;
        while(i >= 0 && j >= 0){
            x = a.charAt(i) - '0';
            y = b.charAt(j) - '0';
            add = x + y + rem;
            if(add == 0 || add == 1){
                ans.append(add);
                rem = 0;
            }
            else if(add == 2){
                rem = 1;
                ans.append("0");
            }
            else{
                rem = 1;
                ans.append("1");
            }
            i--;
            j--;
        }
        while(i >= 0){
            x = a.charAt(i) - '0';
            add = x + rem;
            if(add == 0 || add == 1){
                ans.append(add);
                rem = 0;
            }
            else if(add == 2){
                rem = 1;
                ans.append("0");
            }
            else{
                rem = 1;
                ans.append("1");
            }
            i--;
        }
        while(j >= 0){
            y = b.charAt(j) - '0';
            add = y + rem;
            if(add == 0 || add == 1){
                ans.append(add);
                rem = 0;
            }
            else if(add == 2){
                rem = 1;
                ans.append("0");
            }
            else{
                rem = 1;
                ans.append("1");
            }
            j--;
        }
        if(rem == 1){
            ans.append("1");
        }
        return ans.reverse().toString();
    }
}