class Solution {
    public int removeElement(int[] arr, int val) {
        int n = arr.length;
        int count = n;
        if(n == 0) return 0;
        int i = 0;
        int j = n-1;
        while(i <= j && i < n && j >= 0){
            while(i <= j && arr[j] == val){
                j--;
                count--;
            }
            if(i <= j && arr[i] == val){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }
        return count;
    }
}