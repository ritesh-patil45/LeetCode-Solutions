class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i < n){
            int a = arr[i];
            if(a == i+1 || a == arr[a-1]){
                if(a == arr[a-1] && i != a-1) return arr[i];
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[a-1];
                arr[a-1] = temp;
            }
        }
        return 0;
    }
}