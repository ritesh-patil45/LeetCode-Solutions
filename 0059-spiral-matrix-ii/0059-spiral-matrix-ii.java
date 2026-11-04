class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n]; 
        int minr = 0;
        int maxr = arr.length-1;
        int minc = 0;
        int maxc = arr[0].length-1;
        int a = 1;
        while(minr <= maxr && minc <= maxc){
            for(int j=minc ; j<=maxc ; j++){
                arr[minr][j] = a++;
            }
            minr++;
            if(minr > maxr || minc > maxc) break;
            for(int i=minr ; i<=maxr ; i++){
                arr[i][maxc] = a++;
            }
            maxc--;
            if(minr > maxr || minc > maxc) break;
            for(int j=maxc ; j>=minc ; j--){
                arr[maxr][j] = a++;
            }
            maxr--;
            if(minr > maxr || minc > maxc) break;
            for(int i=maxr ; i>=minr ; i--){
                arr[i][minc] = a++;
            }
            minc++;
        }
        return arr;
    }
}