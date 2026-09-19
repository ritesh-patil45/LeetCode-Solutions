class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int max = 0;
        while(i < j){
            int minh = Math.min(arr[i],arr[j]);
            int area = (j - i) * minh;
            max = Math.max(max, area);
            if(arr[i] < arr[j]){
                i++;
            }
            else j--;
        }
        return max;
    }
}