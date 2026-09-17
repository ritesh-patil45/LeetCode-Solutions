class Solution {
    public int maximumWealth(int[][] matrix) {
        int max = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;
        for(int i=0 ; i<n ; i++){
            count = 0;
            for(int j=0 ; j<m ; j++){
                count += matrix[i][j];
            }
            max = Math.max(max, count);
        }
        return max;
    }
}