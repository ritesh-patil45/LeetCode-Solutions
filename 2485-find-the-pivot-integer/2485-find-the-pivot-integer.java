class Solution {
    public int pivotInteger(int n) {
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int s = 0;
        for(int i=1 ; i<=n ; i++){
            s += i;
            a[i] = s;
        }
        s = 0;
        for(int i=n ; i>=1 ; i--){
            s += i;
            b[i] = s;
        }
        for(int i=1 ; i<=n ; i++){
            if(a[i] == b[i]) return i;
        }
        return -1;
    }
}