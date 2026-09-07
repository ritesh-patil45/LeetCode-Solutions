class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        double ans = 0;
        int idx = -1;
        int n = arr1.length; //i
        int m = arr2.length; //j
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
             if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
             }
             else{
                arr[k] = arr2[j];
                j++;
             }
             k++;
        }
        while(i<n){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        if(k%2 == 0){
            idx = k/2;
            ans = (arr[idx]+arr[idx-1])/2.0;
        }
        else{
            idx = k/2;
            ans = arr[idx];
        }
        return ans;
    }
}