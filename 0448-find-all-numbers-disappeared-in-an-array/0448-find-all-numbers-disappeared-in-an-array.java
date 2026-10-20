class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> a = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i < n){
            int idx = arr[i]-1;
            if(arr[i] != i+1 && arr[i] != arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0 ; j<n ; j++){
            if(arr[j] != j+1){
                a.add(j+1);
            }
        }
        return a;
    }
}