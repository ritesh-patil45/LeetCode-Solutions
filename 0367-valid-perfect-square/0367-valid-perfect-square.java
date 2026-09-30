class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        if(num == 2 || num == 3){
            return false;
        }
        int low = 0;
        int high = num/2;
        while(low <= high){
            int mid = low + (high - low)/2;
            long sq = (long)mid*mid;
            if(sq == num){
                return true;
            } 
            if(sq < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}