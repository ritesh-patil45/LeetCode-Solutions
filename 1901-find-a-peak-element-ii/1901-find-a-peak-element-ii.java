class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[2];
        int i = 0;
        int j = n-1;
        int mid = 0;
        int max = 0;
        int idxi = -1;
        int idxj = -1;
        while(i <= j){
            mid = i + (j-i)/2;
            for(int k=0 ; k<m ; k++){
                if(mat[mid][k] > max){
                    max = mat[mid][k];
                    idxi = mid;
                    idxj = k;
                }
            }
            int up =(mid-1 >= 0) ? mat[mid-1][idxj] : -1;
            int down =(mid+1 < n) ? mat[mid+1][idxj] : -1;
            if(up < mat[idxi][idxj] && down < mat[idxi][idxj]){
                ans[0] = idxi;
                ans[1] = idxj;
                break;
            } 
            else if(up > mat[idxi][idxj]){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
            max = 0;
        }
        return ans;
    }
}