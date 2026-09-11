class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        int j = 0;
        while(i < n){
            while(j < n && s.charAt(j) == ' '){
                j++;
            }
            if (j == n) break;
            i = j;           
            while(i < n && s.charAt(i) != ' '){
                i++;
            }
            String word = s.substring(j, i);
            if(sb.length() == 0){
                sb.append(word);
            }
            else{
                sb.insert(0, word + " ");
            }
            j = i+1;  
        }
    return sb.toString();
    }
}