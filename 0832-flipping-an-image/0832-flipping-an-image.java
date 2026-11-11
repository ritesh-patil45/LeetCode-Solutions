class Solution {
    public int[][] flipAndInvertImage(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        //reverse
        for(int i=0 ; i<n ; i++){
            int x = n-1;
            for(int j=0 ; j<n ; j++){
                ans[i][x] = matrix[i][j];
                x--;
            }
        }
        //flip
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(ans[i][j] == 0){
                    ans[i][j] = 1;
                }
                else{
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}