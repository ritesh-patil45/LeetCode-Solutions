class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        while(i < n && arr[i] != 0){
            i++;
        }
        j = i;
        while(j < n){
            if(arr[j] == 0){
                j++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        // for(int x=0 ; x<n ; x++){
        //     if(arr[x] == 0){
        //         i = x;
        //         j = i+1;
        //         break;
        //     }
        // }
        // if(i == -1) return;
        // while(j<n){
        //     if(arr[j] == 0) j++;
        //     else{
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         i++;
        //         j++;
        //     }
        // }
    }
}    