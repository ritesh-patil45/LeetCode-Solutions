class Solution {
    public int smallestIndex(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i < n){
            int num = arr[i];
            int count = 0;
            while(num != 0){
                count += (num%10);
                num = num/10;
            }
            if(count == i) return i;
            i++;
        }
        return -1;
    }
}