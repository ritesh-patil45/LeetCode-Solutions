class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        int i = 1;
        while(n >= 0){
            n = n-i;
            if(n >= 0)rows++;
            i += 1;
        }
        return rows;
    }
}