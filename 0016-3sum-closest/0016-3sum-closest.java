class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int close = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0 ; i<n-2 ; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int t = arr[i] + arr[j] + arr[k];
                if(target == t) return t;
                else if(target > t){
                    int gap = target - t;
                    close = Math.min(gap, close);
                    if(close == gap) ans = t;
                    j++;
                }
                else{
                    int gap = t - target;
                    close = Math.min(gap, close);
                    if(close == gap) ans = t;
                    k--;
                }
            }
        }
        return ans;
    }
}