class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        int n = arr.length;
        int max = 0;
        List<Boolean> ans = new ArrayList<>(n);
        for(int i=0 ; i<n ; i++){
            max = Math.max(arr[i], max);
        }
        for(int i=0 ; i<n ; i++){
            arr[i] += extraCandies;
            if(arr[i] >= max){
                ans.add(i, true);
            }
            else{
                ans.add(i, false);
            }
            arr[i] -= extraCandies;
        }
        return ans;
    }
}