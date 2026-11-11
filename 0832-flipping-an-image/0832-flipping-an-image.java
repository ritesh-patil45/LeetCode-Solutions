class Solution {
    public int[][] flipAndInvertImage(int[][] ans) {
        int n = ans.length;
        //reverse
        for(int i=0 ; i<n ; i++){
            int x = 0;
            int y = n-1;
            while(x < y){
                int temp = ans[i][x];
                ans[i][x] = ans[i][y];
                ans[i][y] = temp;
                x++;
                y--;
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