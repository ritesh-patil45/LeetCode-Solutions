class Solution {
    public int trap(int[] height) {
        Stack<Integer> r = new Stack<>();
        Stack<Integer> l = new Stack<>();
        int n = height.length;
        int[] ar = new int[n];
        int[] al = new int[n];
        int i = n-1;
        while(i >= 0){
            if(r.isEmpty()){
                r.push(height[i]);
                ar[i] = 0;
            }
            else if(height[i] > r.peek()){
                r.push(height[i]);
                ar[i] = r.peek();
            }
            else{
                ar[i] = r.peek();
            }
            i--;
        }
        i = 0;
        while(i < n){
            if(l.isEmpty()){
                l.push(height[i]);
                al[i] = 0;
            }
            else if(height[i] > l.peek()){
                l.push(height[i]);
                al[i] = l.peek();
            }
            else{
                al[i] = l.peek();
            }
            i++;
        }
        int ans = 0;
        for(i=0 ; i<n ; i++){
            int min = Math.min(al[i], ar[i]);
            if(height[i] < min){
                ans = ans + min - height[i];
            }
        }
        return ans;
    }
}